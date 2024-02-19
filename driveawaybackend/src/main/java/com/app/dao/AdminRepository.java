package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.entities.AdminEntity;

public interface AdminRepository extends JpaRepository<AdminEntity, Integer>{
	
	// for admin login
	@Query("select admin from AdminEntity admin where admin.userName=:userName")
	List<AdminEntity> findByuserName(@Param("userName") String userName);

	
}
