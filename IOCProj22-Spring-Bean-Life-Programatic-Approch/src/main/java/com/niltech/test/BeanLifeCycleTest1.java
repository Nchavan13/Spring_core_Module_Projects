package com.niltech.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.niltech.beans.VotingEligibilityCheck;

public class BeanLifeCycleTest1 {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/niltech/cfgs/applicationContext.xml");
		
		VotingEligibilityCheck check=factory.getBean("voting",VotingEligibilityCheck.class);
		System.out.println(check.checkVotingCriteria());

		factory.destroySingletons();
	}

}
