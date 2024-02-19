package com.app.controller;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.VehicleDTO;
import com.app.entities.Admin;
import com.app.entities.Vehicle;
import com.app.service.AdminService;
import com.app.service.OwnerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController

public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	OwnerService ownerService;
	
	
	//admin login
	/*
	@PostMapping("/adminLogin")
	public ResponseEntity<List<Admin>> userAuthentication(@RequestBody @Valid Admin request){
		
		List<Admin> admin = adminService.adminLogin(request.getUserName());
		if(!admin.isEmpty()) {
			Admin validUser = admin.get(0);
			if(validUser.getPassword().equals(request.getPassword()) && validUser.getUserName().equals(request.getUserName())) {
				try {
					return ResponseEntity.status(HttpStatus.OK).body(admin);
					
				}catch(Exception e) {
					e.getStackTrace();
					return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
				}
			}
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	*/
	
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
	@PutMapping("/acceptVehicalRequest")
	public ResponseEntity<Void>acceptRequest(@RequestBody VehicleDTO dto){
		try {
			this.adminService.vehicleRequest(dto.getId());
			
		}catch(Exception e) {
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
