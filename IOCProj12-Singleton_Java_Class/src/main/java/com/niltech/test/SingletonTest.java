package com.niltech.test;

import com.niltech.ston.Printer;

public class SingletonTest {
	public static void main(String[] args) {
		Printer p1=Printer.getInstance();
		Printer p2=Printer.getInstance();
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println("=================================");
		System.out.println(p1==p2);
	}

}
