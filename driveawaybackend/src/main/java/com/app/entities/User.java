package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "UserDetails")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User extends BaseEntity{
	@Column(length = 30)
	private String userFirstName;
	@Column(length = 30)
	private String userLastName;
	@Column(length = 40)
	private String userPassword;
	@Column(length = 30, unique = true, nullable = false)
	private String userEmail;
	@Column(length = 12)
	private String userMobile;
	//adhar //mdm
//	@Embedded //optional
//	private AdharCard adharcard;
	
	

}
