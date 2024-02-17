package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Booking extends BaseEntity{
	private int vehicleId;
	@Column(nullable = false)
	private String userEmail;
	private String vehicleName;
	private String vehicleNumber;
	private String paymentStatus;
	
}
