package com.niltech.test;

import com.niltech.comp.Flipkart;
import com.niltech.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		
		try {
			Flipkart fpkt=FlipkartFactory.createFlipkart();
			
			String result=fpkt.shopping(new String[] {"Shirt",
					"Pant","trouser"}, new float[] {3400.0f,5600.0f,3000.00f});
			System.out.println(result);
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
