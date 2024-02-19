package com.app.dto;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class BookingDTO {
	

	private String userEmail;  
	
	private String vehicleName;
	
	private String vehicleNumber;
	
	public String paymentStatus;

}
