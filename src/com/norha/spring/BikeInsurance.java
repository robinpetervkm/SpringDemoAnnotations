package com.norha.spring;

import org.springframework.stereotype.Component;

@Component("myInsurance")
public class BikeInsurance implements Insurance {
	
	private Offers currentOffer;
	
	public Offers getCurrentOffer() {
		return currentOffer;
	}

	public void setCurrentOffer(Offers currentOffer) {
		this.currentOffer = currentOffer;
	}

	@Override
	public String showStatus() {
		return "Your Bike is Insured";
	}

}
