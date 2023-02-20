package com.safetynet.saftynetalerts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Firestation {

	@JsonProperty("address")
	private String adress;
	
	@JsonProperty("station")
	private int idStation;
}
