package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.entities.Admin;

public interface AdminDao extends JpaRepository<Admin, Long> {
	
//	// for admin login
//	@Query("select admin from Admin where admin.userName=:userName")
//	List<Admin> findByUserName(@Param("userName")String userName);

}
