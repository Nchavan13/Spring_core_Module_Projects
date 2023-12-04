package com.niltech.comp;

public class Test {

	private int a = 20;
	private String b = "Nilesh";

	private Test(int a, String b) {
		System.out.println("Test.2-param constructor");
		this.a = a;
		this.b = b;
	}

	private Test() {
		System.out.println("Test.0-param constructor");
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}

}
