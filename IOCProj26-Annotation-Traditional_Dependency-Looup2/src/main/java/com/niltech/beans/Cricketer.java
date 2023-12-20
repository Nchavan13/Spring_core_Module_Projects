package com.niltech.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cricket")
@Lazy(true)
public class Cricketer {
	
	public Cricketer() {
		System.out.println("Cricketer:: 0-param constructor");
	}
	
	
	public void bowling() {
		System.out.println("Cricketer is bowling");
	}
	
	public void batting() {
		System.out.println("Cricketer is batting");
		//create additional IOC Container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/niltech/cfgs/applicationContext.xml");
		//perform dependency lookup method to get dependent class obj
		Bat bat=ctx.getBean("bat",Bat.class);//DL Code
		int score=bat.scoreRun();
		System.out.println("Score is:"+score);
		
	}
	
	public void fielding() {
		System.out.println("Cricketer is fielding");
	}
	
	public void wicketkeeping() {
		System.out.println("Cricketer is wicketkeeping");
	}

}
