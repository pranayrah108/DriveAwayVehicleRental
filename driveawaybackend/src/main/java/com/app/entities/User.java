package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "UserDetails")
@NoArgsConstructor
@AllArgsConstructor
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
	//one to one association User------>AdharCard
	@Embedded //optional
	private AdharCard adharDetails;

}
