package com.app.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Embeddable // mandatory : to specify composite value type
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AdharCard {
	//mdm proj
	@Column(name="card_number",length=12,unique=true)
	private String cardNumber;

}
