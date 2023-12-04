package com.niltech.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class A {
    private static final Logger logger = LoggerFactory.getLogger(A.class);

	private B b;

	private A(B b) {
		this.b=b;
		logger.info("A:: 1-param constructor");	
		}

	@Override
	public String toString() {
		return "A [b=]";
	}

}
