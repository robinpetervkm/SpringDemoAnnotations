package com.norha.spring;

import org.springframework.stereotype.Component;

@Component
public class OffersIndia implements Offers {
	@Override
	public String getOffer() {
		return "10% offer for ur next purchase(INDIA)";
	}
}
