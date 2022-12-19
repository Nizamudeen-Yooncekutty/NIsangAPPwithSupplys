package com.nisangapp.nisangapp.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nisangapp.nisangapp.Exception.ResourceNotFoundException;
import com.nisangapp.nisangapp.Repository.SupplyRepository;
import com.nisangapp.nisangapp.model.Supply;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class SupplyController {
	@Autowired
	private SupplyRepository supplyRepository;
	
	@GetMapping("/supply")
	public List<Supply> getallSupply(){
		return supplyRepository.findAll();
	}
	
	@PostMapping("/supply")
	public Supply createSupply(@RequestBody Supply supply) {
		return supplyRepository.save(supply);
	}
	@GetMapping("/supply/{uid}")
	public ResponseEntity<Supply> getSupplyById(@PathVariable Long uid) {
		Supply supply = supplyRepository.findById(uid)
				.orElseThrow(() -> new ResourceNotFoundException("Supply not exist with id :" + uid));
		return ResponseEntity.ok(supply);
	}
	@PutMapping("/supply/{uid}")
	public ResponseEntity<Supply> updateSupply(@PathVariable Long uid, @RequestBody Supply supply){
		Supply supply1 = supplyRepository.findById(uid)
				.orElseThrow(() -> new ResourceNotFoundException("so not exist with id :" + uid));
		
		supply1.setName(supply1.getName());
		supply1.setHireDate(supply1.getHireDate());
		supply1.setPreferedLocation(supply1.getPreferedLocation());
		supply1.setSkills(supply1.getSkills());
		supply1.setTrainings(supply1.getTrainings());
		
		
		Supply updatedSupply = supplyRepository.save(supply);
		return ResponseEntity.ok(updatedSupply);
		
	}
	@DeleteMapping("/supply/{uid}")
	public ResponseEntity<Map<String, Boolean>> deleteSupply(@PathVariable Long uid){
		Supply supply = supplyRepository.findById(uid)
				.orElseThrow(() -> new ResourceNotFoundException("Supply not exist with id :" + uid));
		
		supplyRepository.delete(supply);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	   
	}
	


