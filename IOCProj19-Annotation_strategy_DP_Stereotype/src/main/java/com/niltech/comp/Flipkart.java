package com.niltech.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart {

	@Autowired
	//@Qualifier("dtdc")
	@Qualifier("logistic")
	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart.0-param constructor");
	}

	public String shopping(String items[], float prices[]) {
		System.out.println(courier);
		float billamt = 0.0f;
		for (int i = 0; i < items.length; ++i)
			billamt = billamt + prices[i];
		int oid = new Random().nextInt(100000);
		String status = courier.deliver(oid);
		String finalMessage = Arrays.toString(items) + "are purchased with price" + Arrays.toString(prices)
				+ "having bill amount:" + billamt;
		return finalMessage + "::" + status;

	}
}
