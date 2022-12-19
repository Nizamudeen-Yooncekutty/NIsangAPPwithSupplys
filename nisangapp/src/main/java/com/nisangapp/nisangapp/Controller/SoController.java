package com.nisangapp.nisangapp.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.nisangapp.nisangapp.Repository.SoRepository;
import com.nisangapp.nisangapp.model.So;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class SoController {
	@Autowired
	private SoRepository soRepository;
	
	
	@GetMapping("/so")
	public List<So> getAllSo(){
		return soRepository.findAll();
		
	}
	@PostMapping("/so")
	public So createSo(@RequestBody So so) {
		return soRepository.save(so);
	}
	@GetMapping("/so/{id}")
	public ResponseEntity<So> getSoById(@PathVariable Long id) {
		So so = soRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("So not exist with id :" + id));
		return ResponseEntity.ok(so);
	}
	@PutMapping("/so/{id}")
	public ResponseEntity<So> updateSo(@PathVariable Long id, @RequestBody So so){
		So so1 = soRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("so not exist with id :" + id));
		
		so1.setRequiredSkills(so1.getRequiredSkills());
		so1.setLocation(so1.getLocation());
		so1.setHmDetails(so1.getHmDetails());
		so1.setRoleName(so1.getRoleName());
		so1.setJD(so1.getJD());
		
		So updatedSo = soRepository.save(so);
		return ResponseEntity.ok(updatedSo);
		
	}
	@DeleteMapping("/so/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteSo(@PathVariable Long id){
		So so = soRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("So not exist with id :" + id));
		
		soRepository.delete(so);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	

}
