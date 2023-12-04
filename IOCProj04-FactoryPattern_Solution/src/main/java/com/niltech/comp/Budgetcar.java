package com.niltech.comp;

public class Budgetcar extends Car {
	
	private String regNo;
	
	public Budgetcar(String regNo) {
		System.out.println("Budgetcar.1-param constructor");
		this.regNo=regNo;
	}

	@Override
	public void drive() {
		System.out.println("Budget Car");
		
	}

}
