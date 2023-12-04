package com.niltech.factory;

import com.niltech.comp.Budgetcar;
import com.niltech.comp.Car;
import com.niltech.comp.LuxoryCar;
import com.niltech.comp.SportCar;

public class CarFactory {

	public static Car createCar(String type, String regNo) {
		if (type.equalsIgnoreCase("sports"))
			return new SportCar(regNo);
		else if (type.equalsIgnoreCase("budget"))
			return new Budgetcar(regNo);
		else if (type.equalsIgnoreCase("luxory"))
			return new LuxoryCar(regNo);
		else {
               throw new IllegalArgumentException("Invalid car type!!!!");
		}

	}

}
