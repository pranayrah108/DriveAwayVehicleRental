package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.entities.Owner;
import com.app.entities.Vehicle;

public interface OwnerService {
	
	//Owner registration
	Owner addNewOwner(Owner newOwner);
	
	//Owner login(Owner Operation)
	
	
	//insert (Owner Operation)
	
	
	//select All Vehicles(User Operation)
	
	
	
	//list All Vehicles
	List<Vehicle> showAllVehicles();
	
	//for selecting Vehicles(user Operation)
	Optional<Vehicle> selectVehicleById(Long vehicleId);
	//The Optional class in Java 8 is a container object which is used to contain a value that might or might not be present. It was introduced as a way to help reduce the number of NullPointerExceptions that occur in Java code.
	
	//for selecting all vehicles of a particular owner (admin operation)
	
	
	//findByOwnerEmail
	
	
	//updatePassword


}
