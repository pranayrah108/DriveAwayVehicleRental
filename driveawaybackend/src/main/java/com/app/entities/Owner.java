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
	
	//adhar //mdm
	//One To One association Owner-----> adharCard
	@Embedded //optional
	private AdharCard adharDetails;
	
    //one to many
	@OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true /*, fetch = FetchTupe.EAGAR  */)
	private List<Vehicle> vehicles = new ArrayList<>();
	
	
    //as per Gavin King's IMPORTANT suggestion add helper method to add /remove
	//child
	public void addVehicle(Vehicle v) {
		vehicles.add(v); //Owner--->vehicle
		v.setOwner(this);  //vehicle----->Owner
		
	}
	
	public void removeVehicle(Vehicle v) {
		vehicles.remove(v);
		v.setOwner(null);
	}

	public Owner(String ownerFirstName, String ownerLastName, String ownerEmail, String ownerPassword,
			String ownerMobile, AdharCard adharDetails) {
		super();
		this.ownerFirstName = ownerFirstName;
		this.ownerLastName = ownerLastName;
		this.ownerEmail = ownerEmail;
		this.ownerPassword = ownerPassword;
		this.ownerMobile = ownerMobile;
		this.adharDetails = adharDetails;
	}
	

}
