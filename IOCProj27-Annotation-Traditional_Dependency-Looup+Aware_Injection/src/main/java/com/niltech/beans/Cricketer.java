package com.niltech.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cricket")
public class Cricketer implements ApplicationContextAware {
	
	private ApplicationContext ctx;
	

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Cricketer.setApplicationContext()");
		this.ctx=ctx;
		
	}
	
	public Cricketer() {
		System.out.println("Cricketer:: 0-param constructor");
	}
	
	
	public void bowling() {
		System.out.println("Cricketer is bowling");
	}
	
	public void batting() {
		System.out.println("Cricketer is batting");
		Bat bat=ctx.getBean("bat",Bat.class);//DL Code
		int score=bat.scoreRun();
		System.out.println("Score is:"+score);
		
	}
	
	public void fielding() {
		System.out.println("Cricketer is fielding");
	}
	
	public void wicketkeeping() {
		System.out.println("Cricketer is wicketkeeping");
	}



}
