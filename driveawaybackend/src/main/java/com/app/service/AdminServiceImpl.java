package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.AdminDao;
import com.app.dao.BookingDao;
import com.app.dao.OwnerDao;
import com.app.dao.UserDao;
import com.app.dao.VehicleDao;
import com.app.entities.Booking;
import com.app.entities.Owner;
import com.app.entities.User;
import com.app.entities.Vehicle;
@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDao adminDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private OwnerDao ownerDao;
	
	@Autowired
	private VehicleDao vehicleDao;
	
	private BookingDao bookingDao;
	

	@Override
	public List<User> showAllUsers() {
	
		return userDao.findAll();
	}

	@Override
	public List<Owner> showAllOwners() {
	
		return ownerDao.findAll();
	}

	@Override
	public List<Vehicle> showAllVehicles() {
		
		return vehicleDao.findAll();
	}

	@Override
	public void deleteVehicleRequestByVehicleRequestId(Long requestId) {
		
		this.vehicleDao.deleteById(requestId);
	}

	@Override
	public List<Booking> showAllBooking() {
	
		return bookingDao.findAll();
	}



}
