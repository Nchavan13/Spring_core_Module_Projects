package com.niltech.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart.0-param constructor");
	}

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}

	public String shopping(String items[], float prices[]) {
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
