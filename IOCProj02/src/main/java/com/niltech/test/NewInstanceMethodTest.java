package com.niltech.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstanceMethodTest {
	public static void main(String[] args) throws Exception {

		// load classes
		Class c1 = Class.forName(args[0]);
		
		//get all constructors....
		
		Constructor cons[]=c1.getDeclaredConstructors();
		
		cons[1].setAccessible(true);
		
		//dynamic object creation using 0 param construcor...
		
		Object obj1=cons[1].newInstance();
		System.out.println(obj1);
		System.out.println("------------------------------------------");
		cons[0].setAccessible(true);
		
		//dynamic object creation using 2 param construcor...
		
				Object obj2=cons[0].newInstance(100,"Nilesh");
				System.out.println(obj2);
				System.out.println("------------------------------------------");
				
		
		

	}

}
