package com.app.service;

import java.util.List;

import com.app.entities.Owner;
import com.app.entities.Vehicle;

public interface OwnerService {
//	
//	List<Employee> getAllEmps();
//	Employee addEmpDetails(Employee newEmp);
//	String deleteEmpDetails(Long emoId);
//	Employee getEmpDetails(Long empId);
//	Employee updateEmpDetails(Employee emp);
//	
//--------------------------------------------------------------
	//CRUD Operation
	List<Owner> getAllOwners();
	
	Owner addOwnerDetails(Owner newOwner);
	
	String deleteOwnerDetails(Long ownerId);
	
	Owner getOwnerDetails(Long ownerId);
	
	Owner updateOwnerDetails(Owner owner);
	
		
	
	//-----------------------------------------------------------
	
	
////	//Owner login
////	List<Owner> ownerLogin(String ownerEmail);
//	
//	//insert(Owner operation)
//	
//	
//	//list all vehicle
//	List<Vehicle> showAllVehicles();
//	
//	//Add Owner 
//	Owner addOwnerDetails(Owner newOwner);
//	

}
