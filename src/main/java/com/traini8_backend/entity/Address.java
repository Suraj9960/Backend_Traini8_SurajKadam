package com.traini8_backend.entity;

import jakarta.persistence.*;

@Embeddable
public class Address {
	
	private String detailedAddres;
	
	private String City;
	
	private String State;
	
	private Integer Pincode;
	
	public String getDetailedAddres() {
		return detailedAddres;
	}

	public void setDetailedAddres(String detailedAddres) {
		this.detailedAddres = detailedAddres;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Integer getPincode() {
		return Pincode;
	}

	public void setPincode(Integer pincode) {
		Pincode = pincode;
	}
}
