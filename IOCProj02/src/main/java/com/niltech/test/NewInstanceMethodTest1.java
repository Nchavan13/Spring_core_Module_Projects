package com.niltech.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstanceMethodTest1 {
	public static void main(String[] args) throws Exception {

		// load classes
		Class c1 = Class.forName(args[0]);
		
		//get all constructors....
		
		Constructor cons[]=c1.getDeclaredConstructors();
		
		//dynamic object creation using 0 param construcor...
		
		Object obj1=cons[0].newInstance();
		System.out.println(obj1);
		System.out.println("------------------------------------------");
		
		//dynamic object creation using 2 param construcor...
		
				Object obj2=cons[1].newInstance(100,"Nilesh");
				System.out.println(obj2);
				System.out.println("------------------------------------------");
				
		
		

	}

}
