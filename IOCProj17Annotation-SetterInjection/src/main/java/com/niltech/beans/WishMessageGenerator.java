package com.niltech.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WishMessageGenerator {

	
    @Autowired
    @Qualifier("dt")
	private Date date;
    
    
    @Autowired
   	@Qualifier("dt2")
   	public void setDate(Date date) {
   		System.out.println("WishMessageGenerator.setDate()");
   		this.date = date;
   	}
    
    @Autowired
	@Qualifier("dt3")
	public void assign(Date date) {
		System.out.println("WishMessageGenerator.assign()");
		this.date=date;
	}

	@Autowired
	public WishMessageGenerator(@Qualifier("dt1") Date date) {
		this.date = date;
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
