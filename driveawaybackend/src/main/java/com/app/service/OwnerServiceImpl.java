package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.BookingDao;
import com.app.dao.OwnerDao;
import com.app.dao.VehicleDao;
import com.app.entities.Owner;
import com.app.entities.Vehicle;

public class OwnerServiceImpl implements OwnerService{

	@Autowired
	private VehicleDao vehicleDao;
	
	@Autowired
	private OwnerDao ownerDao;
	
	@Autowired
	private BookingDao bookingDao;

	
	@Override
	public List<Owner> getAllOwners() {
		
		return ownerDao.findAll();
	}

	@Override
	public Owner addOwnerDetails(Owner newOwner) {
		
		return ownerDao.save(newOwner);
	}

	@Override
	public String deleteOwnerDetails(Long ownerId) {
		
		 ownerDao.deleteById(ownerId);
		 return "Deleted Owner Details";
	}

	@Override
	public Owner getOwnerDetails(Long ownerId) {
		
		return null;
	}

	@Override
	public Owner updateOwnerDetails(Owner owner) {
		
		return null;
	}
	///-----------------------------------------------
	
	
	
	
//	//Owner login
////	@Override
////	public List<Owner> ownerLogin(String ownerEmail) {
////		// TODO Auto-generated method stub
////		List<Owner> owner = ownerDao.findBy
////		return null;
////	}
//
//	@Override
//	public List<Vehicle> showAllVehicles() {
//		// TODO Auto-generated method stub
//		return vehicleDao.findAll();
//	}
	
	///-----------------------------------------------
	
	
	
	

}
