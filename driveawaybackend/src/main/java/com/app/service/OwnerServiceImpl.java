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
	public Owner addNewOwner(Owner newOwner) {
		
		return ownerDao.save(newOwner);
	}

	@Override
	public List<Vehicle> showAllVehicles() {
		
		return vehicleDao.findAll();
	}
	
	
}
