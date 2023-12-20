package com.niltech.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niltech.beans.VotingEligibilityCheck;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/niltech/cfgs/applicationContext.xml");
		
		VotingEligibilityCheck check=ctx.getBean("voting",VotingEligibilityCheck.class);
		System.out.println(check.checkVotingCriteria());
		ctx.close();

	}

}
