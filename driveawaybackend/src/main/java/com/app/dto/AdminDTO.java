package com.app.dto;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class AdminDTO {

	
	@Column(length = 30, nullable = false)
	private String userName;
	
	private String password;

}
