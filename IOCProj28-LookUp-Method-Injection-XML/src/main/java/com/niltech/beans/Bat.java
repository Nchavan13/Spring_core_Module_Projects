package com.niltech.beans;

import java.util.Random;

public class Bat {
	
	public Bat()
	{
		System.out.println("Bat::0-param constructor");
	}
	
	public int scoreRun() {
		System.out.println("Bat.scoreRun()");
		return new Random().nextInt(130);
	}

}
