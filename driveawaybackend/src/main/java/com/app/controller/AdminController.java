package com.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.AdminService;
import com.app.service.OwnerService;

@RestController

public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	OwnerService ownerService;
	
	
	//admin login
	
	
	//get all the users (Admin operation)
	//ResponseEntity represents the whole HTTP response: status code, headers, and body.
	@GetMapping("/listAllUsers")
	public ResponseEntity<?> getAllUsers(){
		
		return ResponseEntity.ok(adminService.showAllUsers());
	}
	
	
	//get all the vehicles (Admin operation)
	@GetMapping("/listAllOwners")
	public ResponseEntity<?> gettAllOwners(){
		
		return ResponseEntity.ok(adminService.showAllOwners());
	}
	
	
	//getting all vehicles and their status
	@GetMapping("/listAllVehicles")
	public ResponseEntity<?> getAllVehicles(){
		
		return ResponseEntity.ok(adminService.showAllVehicles());
	}
	
	//get all vehicles of a perticular owner(admin  operation)
	
	//accept owner vehicle request
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
