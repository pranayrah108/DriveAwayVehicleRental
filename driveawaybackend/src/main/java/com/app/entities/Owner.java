package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

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
//@ToString(exclude = "vehicles")
public class Owner extends BaseEntity{
	@Column(length = 30)
	private String ownerFirstName;
	@Column(length = 30)
	private String ownerLastName;
	@Column(length = 30, unique = true)
	private String ownerEmail;
	@Column(length = 40)
	private String ownerPassword;
	@Column(length = 12)
	private String ownerMobile;
	
//	@Embedded //optional
//	private AdharCard ownerAdharcard;
	
//	//
//	@OneToMany(mappedBy = "Owne", cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<Vehicle> vehicles = new ArrayList<>();
//	
//	
//    //as per Gavin King's IMPORTANT suggestion add helper method to add /remove
//	//child
//	public void addVehicle(Vehicle v) {
//		vehicles.add(v); //Owner--->vehicle
//		v.setOwn(null);  //vehicle----->Owner
//		//employee me department dept
//	}
//	
//	public void removeVehicle(Vehicle v) {
//		vehicles.remove(v);
//		v.setOwn(null);
//	}
//	
//	

	
	
	

}
