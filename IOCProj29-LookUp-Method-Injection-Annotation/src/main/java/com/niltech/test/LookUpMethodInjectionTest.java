package com.niltech.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niltech.beans.Cricketer;

public class LookUpMethodInjectionTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/niltech/cfgs/applicationContext.xml");
		//get target class object
		Cricketer cricketer=ctx.getBean("cricket",Cricketer.class);
		System.out.println(cricketer.getClass()+" "+cricketer.getClass().getSuperclass()+" "+Arrays.toString(cricketer.getClass().getDeclaredMethods()));
		
		cricketer.batting();
		//cricketer.batting();
		cricketer.bowling();
		cricketer.fielding();
	}

}
