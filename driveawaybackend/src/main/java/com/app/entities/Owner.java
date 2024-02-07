package com.app.entities;

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
public class Owner {
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
	
	@Embedded //optional
	private AdharCard ownerAdharcard;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")//optional
	private Vehicle vehicle;
	
	
	
	

}
