package com.niltech.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired
	private Date date;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");
	}

	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage()");
		System.out.println("date:" + date);
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
