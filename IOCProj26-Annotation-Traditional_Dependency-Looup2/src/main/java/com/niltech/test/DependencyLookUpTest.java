package com.niltech.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niltech.beans.Cricketer;

public class DependencyLookUpTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/niltech/cfgs/applicationContext.xml");
		
		//get target class object
		Cricketer cricketer=ctx.getBean("cricket",Cricketer.class);
		
		cricketer.batting();
		cricketer.bowling();
		cricketer.fielding();
	}

}
