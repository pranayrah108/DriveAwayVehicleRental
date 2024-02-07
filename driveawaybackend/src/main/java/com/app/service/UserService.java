package com.app.service;

import java.util.List;

import com.app.entities.Booking;
import com.app.entities.User;
import com.app.entities.Vehicle;

public interface UserService {
	
	//newUserRegistration
	User newUserRegistration(User newUser);
	
	//user login
	
	
	//for user vehicle selection
	//List<Vehicle> getVehicleById(Long vehicleReqId);
	
	//insertUserBooking
	Booking insertUserBooking(Booking bookingObj);
	
	//showAllUserBookings
	//List<Booking> showAlluserBooking(String userEmail);
	
	//deleteUserBooking
	String deleteUserBooking(Long bookingId);
	
	//showAllUserBookingsById

	
	//findByUserEmail
	
	
	//update password
	
	
	//paymentInfo
	
	
	//acceptpayment
	
	
	//-------------------------------------------------
//	
//	List<Employee> getAllEmps();
//	Employee addEmpDetails(Employee newEmp);
//	String deleteEmpDetails(Long emoId);
//	Employee getEmpDetails(Long empId);
//	Employee updateEmpDetails(Employee emp);
//

}
