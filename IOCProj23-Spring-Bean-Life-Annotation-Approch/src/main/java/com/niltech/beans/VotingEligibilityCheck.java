package com.niltech.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voting")
@PropertySource("com/niltech/commons/info.properties")
public class VotingEligibilityCheck {
	
	@Value("${per.name}")
	private String name;
	@Value("${per.age}")
	private int age;
	@Value("${per.address}")
	private String address;
	private Date verifiedOn;

	public String checkVotingCriteria() {
		System.out.println("VotingEligibilityCheck.checkVotingCriteria()");
		if (age < 18)
			return "Mr./Miss/Mrs." + name + " belong to " + address + " is not eligible for voting --> verified on::"
					+ verifiedOn;
		else
			return "Mr./Miss/Mrs." + name + " belong to " + address + " is  eligible for voting --> verified on::"
					+ verifiedOn;

	}

	@PostConstruct
	public void myInit() {
		System.out.println("VotingEligibilityCheck.myInit()");
		verifiedOn = new Date();
		if (address == null)
			address = " not provided";
		if (name == null)
			throw new IllegalArgumentException("Name is Required");
		else if (age <= 0 || age >= 126)
			throw new IllegalArgumentException("Person age must be in range of 1 through 125");
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("VotingEligibilityCheck.myDestroy()");
		name = null;
		age = 0;
		verifiedOn = null;
		address = null;
	}

}
