package com.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OwnerDTO {
	@JsonProperty(access = Access.READ_ONLY)
	private Long id;
	
	private String ownerFirstName;
	
	private String ownerLastName;
	
	private String ownerEmail;
	
	private String ownerPassword;
	
	private String ownerMobile;

}
