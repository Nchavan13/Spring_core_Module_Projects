package com.niltech.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VotingEligibilityCheck  implements InitializingBean,DisposableBean{
	private String name;
	private int age;
	private String address;
	private Date verifiedOn;
	
	public void setName(String name) {
		System.out.println("VotingEligibilityCheck.setName()");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("VotingEligibilityCheck.setAge()");
		this.age = age;
	}
	public void setAddress(String address) {
		System.out.println("VotingEligibilityCheck.setAddress()");
		this.address = address;
	}
	
	
	public String checkVotingCriteria() {
		System.out.println("VotingEligibilityCheck.checkVotingCriteria()");
		if(age<18)
			return "Mr./Miss/Mrs."+name+ " belong to "+address+" is not eligible for voting --> verified on::"+verifiedOn;
		else
			return "Mr./Miss/Mrs."+name+ " belong to "+address+" is  eligible for voting --> verified on::"+verifiedOn;

	}
	@Override
	public void destroy() throws Exception {
		System.out.println("VotingEligibilityCheck.destroy()");
		name=null;
		age=0;
		verifiedOn=null;
		address=null;

	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("VotingEligibilityCheck.afterPropertiesSet()");
		verifiedOn=new Date();
		if(address==null)
			address=" not provided";
		if(name==null)
			throw new IllegalArgumentException("Name is Required");
		else if(age<=0 ||age>=126)
			throw new IllegalArgumentException("Person age must be in range of 1 through 125");
	
	}
	
	
	

}
