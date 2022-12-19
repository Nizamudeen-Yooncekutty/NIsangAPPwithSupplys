package com.nisangapp.nisangapp.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "serviceOrder")
public class So {
	private Long id;
	private String requiredSkills;
	private String location;
	private String hmDetails;
	private String roleName;
	private String JD;
	
	public So() {
		super();
	}

	public So(String requiredSkills, String location, String hmDetails, String roleName, String jD) {
		super();
		this.requiredSkills = requiredSkills;
		this.location = location;
		this.hmDetails = hmDetails;
		this.roleName = roleName;
		JD = jD;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRequiredSkills() {
		return requiredSkills;
	}

	public void setRequiredSkills(String requiredSkills) {
		this.requiredSkills = requiredSkills;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getHmDetails() {
		return hmDetails;
	}

	public void setHmDetails(String hmDetails) {
		this.hmDetails = hmDetails;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getJD() {
		return JD;
	}

	public void setJD(String jD) {
		JD = jD;
	}

	@Override
	public String toString() {
		return "So [id=" + id + ", requiredSkills=" + requiredSkills + ", location=" + location + ", hmDetails="
				+ hmDetails + ", roleName=" + roleName + ", JD=" + JD + "]";
	}

	

	
	
	
	

}
