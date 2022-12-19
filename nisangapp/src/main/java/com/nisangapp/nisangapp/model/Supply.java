package com.nisangapp.nisangapp.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "SuppliesDb")
public class Supply {
	private long uid ;
	private String name;
	private Date hireDate;
	private String skills;
	private String trainings;
	private String preferedLocation;
	public Supply() {
		super();
	}
	public Supply(long uid, String name, Date hireDate, String skills, String trainings, String preferedLocation) {
		super();
		this.uid = uid;
		this.name = name;
		this.hireDate = hireDate;
		this.skills = skills;
		this.trainings = trainings;
		this.preferedLocation = preferedLocation;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getTrainings() {
		return trainings;
	}
	public void setTrainings(String trainings) {
		this.trainings = trainings;
	}
	public String getPreferedLocation() {
		return preferedLocation;
	}
	public void setPreferedLocation(String preferedLocation) {
		this.preferedLocation = preferedLocation;
	}
	@Override
	public String toString() {
		return "Supply [uid=" + uid + ", name=" + name + ", hireDate=" + hireDate + ", skills=" + skills
				+ ", trainings=" + trainings + ", preferedLocation=" + preferedLocation + "]";
	}
	
	
	
	
	

}
