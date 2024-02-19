package com.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VehicleDTO {
	@JsonProperty(access = Access.READ_ONLY)
	private Long id;
	
	private String vehicleName;

	private String vehicleNumber;

	private String vehicleChasisNumber;
	
	//vehicle image
	
	private String vehicleReqStatus;
	@JsonProperty(access = Access.WRITE_ONLY)
	private Long OwnerId;

}
