package com.app.dto;

import java.time.LocalDate;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class UserRentDTO {
	
	
	private String travelDistance;
	
	private String driveingLicence;
	
	private LocalDate bookingDate;
	
	private double amountPaid;

}
