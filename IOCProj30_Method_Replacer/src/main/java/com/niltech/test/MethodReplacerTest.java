package com.niltech.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niltech.service.BankService;

public class MethodReplacerTest {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/niltech/cfgs/applicationContext.xml");
		//get proxy class object
		
		BankService service=ctx.getBean("bank",BankService.class);
		System.out.println(service.getClass()+" "+service.getClass().getSuperclass()+" "+Arrays.toString(service.getClass().getDeclaredMethods()));
		System.out.println("Intrest Amount::"+service.calInterestAmount(100000, 2, 12));
		ctx.close();
	}

}
