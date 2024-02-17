package com.app.service;

import java.util.List;

import com.app.entities.Admin;
import com.app.entities.Booking;
import com.app.entities.Owner;
import com.app.entities.User;
import com.app.entities.Vehicle;

public interface AdminService {
	
	//admin login
	public List<Admin> adminLogin(String username);
	
	//listing All users
	List<User> showAllUsers();
	
	//listing All Owners
	List<Owner> showAllOwners();
	
	//listing All vehicles
	List<Vehicle> showAllVehicles();
	
	//acceptVehicleRequest of Owner
	
	
	//delete the vehicle add request of Owner
	void deleteVehicleRequestByVehicleRequestId(Long requestId);
	
	//listing All Bookings
	List<Booking> showAllBooking();
	
	

}
