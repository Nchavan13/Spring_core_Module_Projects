package com.niltech.beans;

public class B {
	private A a;
	
	private B()
	{
		System.out.println("B:: 0-param constructor");
	}

	public void setA(A a) {
		System.out.println("B.setA()");
		this.a = a;
	}

	@Override
	public String toString() {
		return "B [a=]";
	}
	
	

}
