package com.norha.spring;

import org.springframework.stereotype.Component;

@Component("offersUS")
public class OffersUS implements Offers {
	@Override
	public String getOffer() {
		return "15% offer for ur next purchase(US)";
	}
}
