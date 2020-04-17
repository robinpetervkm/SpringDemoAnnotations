package com.norha.spring;


public class BikeInsurance implements Insurance {
	public BikeInsurance(Offers offer) {
		System.out.println(offer.getOffer());
	}

	@Override
	public String showStatus() {
		return "Your Bike is Insured";
	}

}
