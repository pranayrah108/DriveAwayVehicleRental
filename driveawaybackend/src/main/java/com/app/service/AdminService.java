package com.app.service;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.AdminRepository;
import com.app.dao.BookingRepository;
import com.app.dao.OwnerRepository;
import com.app.dao.UserRepository;
import com.app.dao.VehicleRepository;
import com.app.entities.AdminEntity;
import com.app.entities.BookingEntity;
import com.app.entities.OwnerEntity;
import com.app.entities.UserEntity;
import com.app.entities.VehicleEntity;




@Service
public class AdminService {

	@Autowired 
	UserRepository userRepo;
	
	@Autowired
	OwnerRepository ownerRepo;
	
	@Autowired
	VehicleRepository vehicleRepo;
	
	@Autowired
	AdminRepository adminRepo;
	
	@Autowired
	BookingRepository bookingRepo;
	
	// admin Login
	public List<AdminEntity> adminLogin(@Valid String userName) {
		List<AdminEntity> list = (List<AdminEntity>) adminRepo.findByuserName(userName);
		return list;
	}	

	// listing all users
	public List<UserEntity> showAllUsers() {
		List<UserEntity> list = (List<UserEntity>) userRepo.findAll();
		return list; 
	 }
		
	// listing all owners
	public List<OwnerEntity> showAllOwners() {
			List<OwnerEntity> list = (List<OwnerEntity>) ownerRepo.findAll();
			return list; 
	}
	
	// listing all vehicles
	public List<VehicleEntity> showAllVehicles() {
		List<VehicleEntity> list = (List<VehicleEntity>) vehicleRepo.findAll();				  
		return list; 
	}
		
	//acceptVehicalRequest of owner
	public void vehicalRequest(int vehicleReqestId) {
		this.vehicleRepo.vehicleReqestId(vehicleReqestId);
		// save() is used for update also JPA does not have special method for Update()
	}	
	
	//delete the vehicle add request of owner
	public void deleteVehicleRequestByvehicleReqestId(int requestId) {
		this.vehicleRepo.deleteById(requestId);
	}

	public List<BookingEntity> showAllBooking() {
		List<BookingEntity> list = (List<BookingEntity>) bookingRepo.findAll();				  
		return list; 
	}

}
