package com.app.service;

import java.util.List;

import com.app.entities.Admin;
import com.app.entities.Owner;
import com.app.entities.User;
import com.app.entities.Vehicle;

public interface AdminService {
	
	//admin login
	List<Admin> adminlogin(String userName);
	
	//listing all users
	List<User> showAllUsers();
	
	//listing All Owners
	List<Owner> showAllOwners();
	
	//listing All vehicles
	List<Vehicle> showAllVehicles();
	
	

}
