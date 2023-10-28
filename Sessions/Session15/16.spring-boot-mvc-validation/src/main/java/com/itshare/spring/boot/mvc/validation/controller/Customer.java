package com.itshare.spring.boot.mvc.validation.controller;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Customer {

	private String firstName;

	@NotNull(message="it can not be null")
	@Size(min=1,message="is required")
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=0 , message="must be greater than 0")
	@Max(value=10 , message="must be less than or equal 10")
	private Integer degrees;

	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5 characters OR digits")
	private String postalCode;
	public Integer getDegrees() {
		return degrees;
	}

	
	
	public String getPostalCode() {
		return postalCode;
	}



	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}



	public void setDegrees(Integer degrees) {
		this.degrees = degrees;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
}
