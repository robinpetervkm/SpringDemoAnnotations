package com.norha.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myInsurance")
public class BikeInsurance implements Insurance {
	
	private Offers currentOffer;
	
	@Override
	public Offers getCurrentOffer() {
		return currentOffer;
	}

	@Override
	public String showStatus() {
		return "Your Bike is Insured";
	}
	
	@Autowired
	public void setCurrentOffer(Offers currentOffer) {
		this.currentOffer = currentOffer;
	}
	

}
