package com.niltech.test;

import com.niltech.comp.Budgetcar;
import com.niltech.comp.Car;
import com.niltech.factory.CarFactory;

public class Customer1 {
	public static void main(String[] args) {
		Car car=CarFactory.createCar("budget", "MH28T8817");
		car.drive();
		System.out.println("==============");
	}

}
