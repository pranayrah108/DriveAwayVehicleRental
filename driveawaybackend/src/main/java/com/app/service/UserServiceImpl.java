package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.BookingDao;
import com.app.dao.UserDao;
import com.app.dao.VehicleDao;
import com.app.entities.Booking;
import com.app.entities.User;
import com.app.entities.Vehicle;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private VehicleDao vehicleDao;
	
	@Autowired
	private BookingDao bookingDao;

	@Override
	public User newUserRegistration(User newUser) {
		
		return userDao.save(newUser);
	}

//	@Override
//	public List<Vehicle> getVehicleById(Long vehicleReqId) {
//		
//		return vehicleDao.findBy;
//	}

	@Override
	public Booking insertUserBooking(Booking bookingObj) {
		
		return bookingDao.save(bookingObj);
	}

//	@Override
//	public List<Booking> showAlluserBooking(String userEmail) {
//		
//		return null;
//	}

	@Override
	public String deleteUserBooking(Long bookingId) {
		if(bookingDao.existsById(bookingId)) {
			bookingDao.deleteById(bookingId);
			return "Deketed userBooking details";
		}
		return "invalidUserBookingId";
	}

}
