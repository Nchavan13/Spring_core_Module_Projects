package com.niltech.test;

import com.niltech.comp.Car;
import com.niltech.comp.LuxoryCar;
import com.niltech.factory.CarFactory;

public class Customer3 {
	public static void main(String[] args) {
		Car car=CarFactory.createCar("luxory", "MH28T8444");
		car.drive();
		System.out.println("==============");
	}

}
