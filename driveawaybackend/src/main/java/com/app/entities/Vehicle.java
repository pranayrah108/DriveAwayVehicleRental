package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Vehicle {
	@Column(length = 30)
	private String vehicleName;
	@Column(length = 30)
	private String vehicleNumber;
	@Column(length = 20)
	private String vehicleChasisNumber;
	
	//vehicle image
	private String vehicleReqStatus;
	

}
