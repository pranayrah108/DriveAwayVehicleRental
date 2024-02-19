package com.app.entities;

import java.text.DateFormat;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "UserRent_Details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserRentEntity extends BaseEntity{
	
	@Column(length = 30)
	private String travelDistance;
	
	@Column(length = 30)
	private String driveingLicence;
	
	private LocalDate bookingDate;
	
	private double amountPaid;

}
