package com.niltech.test;

import com.niltech.comp.Car;
import com.niltech.comp.SportCar;
import com.niltech.factory.CarFactory;

public class Customer2 {
	public static void main(String[] args) {
		Car car=CarFactory.createCar("sports", "MH28T8717");
		car.drive();
		System.out.println("==============");
	}

}
