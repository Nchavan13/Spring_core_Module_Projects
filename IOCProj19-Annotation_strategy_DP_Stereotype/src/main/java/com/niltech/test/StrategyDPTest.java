package com.niltech.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niltech.comp.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/niltech/common/applicationContext.xml");
		
		Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);

		String result = fpkt.shopping(new String[] { "shirt", "trouser", "glasses" },

				new float[] { 123.22f, 15462.215f, 55555.5555f });

		System.out.println(result);
	}

}
