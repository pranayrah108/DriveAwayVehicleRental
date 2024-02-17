package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

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
@ToString(exclude = {"owner"}, callSuper = true)
public class Vehicle extends BaseEntity{
	@Column(length = 30)
	private String vehicleName;
	@Column(length = 30)
	private String vehicleNumber;
	@Column(length = 20)
	private String vehicleChasisNumber;
	
	//vehicle image
	
	
	private String vehicleReqStatus;
	
	//foreign key primary key of OwnerEntity
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner_id")  // Optional But reco, to specify the name of FK Col.
	private Owner owner;
	
	

}
