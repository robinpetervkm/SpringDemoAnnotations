package com.norha.spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {
	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("Beans.xml");
		BikeInsurance status = context.getBean("bikeInsurance",BikeInsurance.class);
		System.out.println(status.showStatus());
		
		context.close();
	}
}
