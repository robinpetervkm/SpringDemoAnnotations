package com.norha.spring;


public class BikeInsurance implements Insurance {
	

	@Override
	public String showStatus() {
		return "Your Bike is Insured";
	}

	
}
