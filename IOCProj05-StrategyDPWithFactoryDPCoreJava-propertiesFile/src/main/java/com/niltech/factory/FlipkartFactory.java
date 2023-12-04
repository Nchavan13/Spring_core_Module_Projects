package com.niltech.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.niltech.comp.BlueDart;
import com.niltech.comp.Courier;
import com.niltech.comp.DTDC;
import com.niltech.comp.Flipkart;

public class FlipkartFactory {

	private static Properties props;

	static {
		try {
			// load properties fie

			FileInputStream fis = new FileInputStream("src/main/java/com/niltech/common/info.properties");
			{
				// load file content

				props = new Properties();
				props.load(fis);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Flipkart createFlipkart() throws Exception {

		Flipkart fpkt = new Flipkart();

		// load dependent class
		Class c = Class.forName(props.getProperty("dependent.comp"));

		// create obj using reflection API

		Constructor cons[] = c.getDeclaredConstructors();

		Courier courier = (Courier) cons[0].newInstance();
		fpkt.setCourier(courier);
		return fpkt;
	}

}
