package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.AdminDao;
import com.app.dao.OwnerDao;
import com.app.dao.UserDao;
import com.app.dao.VehicleDao;
import com.app.entities.Admin;
import com.app.entities.Owner;
import com.app.entities.User;
import com.app.entities.Vehicle;

public class AdminServiceImpl implements AdminService {
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private AdminDao adminDao;
	
	@Autowired
	private VehicleDao vehicleDao;
	
	@Autowired
	private OwnerDao ownerDao;
	
	

	@Override
	public List<Admin> adminlogin(String userName) {
		
		return adminDao.findBy;
	}

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

}
