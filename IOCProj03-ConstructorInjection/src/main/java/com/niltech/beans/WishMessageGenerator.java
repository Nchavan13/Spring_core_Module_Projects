package com.niltech.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");
	}

	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator.1-param constructor");
		this.date = date;
	}
	
	

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}

	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage()::"+date);
		int hour = date.getHours();

		if (hour < 12)
			return "Good Morning::" + user;
		else if (hour < 16)
			return "Good Afternoon::" + user;
		else if (hour < 20)
			return "Good Evening::" + user;
		else
			return "Good Night::" + user;

	}

}
