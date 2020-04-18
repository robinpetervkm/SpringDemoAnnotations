package com.norha.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myInsurance")
public class BikeInsurance implements Insurance {
	@Autowired
	@Qualifier("offersUS")
	private Offers currentOffer;
	
	@Override
	public Offers getCurrentOffer() {
		return currentOffer;
	}

	@Override
	public String showStatus() {
		return "Your Bike is Insured";
	}
}
