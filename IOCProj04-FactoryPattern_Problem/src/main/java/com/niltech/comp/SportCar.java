package com.niltech.comp;

public class SportCar extends Car {

	private String regNo;

	public SportCar(String regNo) {
		System.out.println("SportCar.1-param constructor");
		this.regNo = regNo;
	}

	@Override
	public void drive() {
		System.out.println("Sport Car");

	}

}
