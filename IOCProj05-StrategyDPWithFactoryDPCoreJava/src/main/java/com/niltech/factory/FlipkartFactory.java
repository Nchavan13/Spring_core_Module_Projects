package com.niltech.factory;

import com.niltech.comp.BlueDart;
import com.niltech.comp.Courier;
import com.niltech.comp.DTDC;
import com.niltech.comp.Flipkart;

public class FlipkartFactory {

	public static Flipkart createFlipkart(String courierType) {

		Flipkart fpkt = new Flipkart();
		Courier courier = null;
		if (courierType.equalsIgnoreCase("dtdc"))
			courier = new DTDC();
		else if (courierType.equalsIgnoreCase("dart"))
			courier = new BlueDart();
		else
			throw new IllegalArgumentException("Invalid type");
		fpkt.setCourier(courier);
		return fpkt;
	}

}
