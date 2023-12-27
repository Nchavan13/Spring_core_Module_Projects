package com.niltech.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class InterestReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("InterestReplacer::reimplement()::(Simple Interest)");
		double pamt=(double)args[0];
		double rate=(double)args[1];
		double time=(double)args[2];
		//write new logic here
		return pamt*rate*time/100;		
	}

}
