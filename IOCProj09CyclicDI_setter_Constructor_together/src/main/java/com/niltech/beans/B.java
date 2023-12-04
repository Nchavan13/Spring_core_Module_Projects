package com.niltech.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B {
    private static final Logger logger = LoggerFactory.getLogger(A.class);

	private A a;
	
	private B(A a)
	{
		this.a=a;
		logger.info("B:: 1-param constructor");	
	}


	@Override
	public String toString() {
		return "B [a=]";
	}
	
	

}
