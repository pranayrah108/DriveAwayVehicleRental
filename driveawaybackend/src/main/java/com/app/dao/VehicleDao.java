package com.app.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.entities.Vehicle;

public interface VehicleDao extends JpaRepository<Vehicle, Long> {

	//for accepting owner request(Admin operation)
	@Transactional
	@Modifying
	@Query("update Vehicle vehicle set vehicle.vehicleRequestStatus='accepted' where vehicle.vehicleRequestId=:vehicleRequestId")
	void vehicleRequestId(@Param("vehicleRequestId") int vehicleRequestId);
}
