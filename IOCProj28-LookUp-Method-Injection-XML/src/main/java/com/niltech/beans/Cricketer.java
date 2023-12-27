package com.niltech.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Cricketer {
	
	public Cricketer() {
		System.out.println("Cricketer:: 0-param constructor");
	}
	
	
	public void bowling() {
		System.out.println("Cricketer is bowling");
	}
	
	public abstract Bat createBat();//this method will be executed
	                               //in memory proxy class of this class
	                              // having dependency lookup logic
	
	public void batting() {
		System.out.println("Cricketer is batting");
		//get dependent class object
		Bat bat=createBat();
		//invoke method;
		int score=bat.scoreRun();
		System.out.println("Cricketer Score is::"+score);
	}
	
	public void fielding() {
		System.out.println("Cricketer is fielding");
	}
	
	public void wicketkeeping() {
		System.out.println("Cricketer is wicketkeeping");
	}

}
