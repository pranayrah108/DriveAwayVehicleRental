package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.AdminService;
import com.app.service.OwnerService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	OwnerService ownerService;
	
	

}
