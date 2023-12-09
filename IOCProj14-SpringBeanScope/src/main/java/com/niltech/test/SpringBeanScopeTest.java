package com.niltech.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.niltech.beans.WishMessageGenerator;

public class SpringBeanScopeTest {
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/niltech/cfg/applicationContext.xml");
		
		WishMessageGenerator generator1=factory.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator generator2=factory.getBean("wmg",WishMessageGenerator.class);
		
		System.out.println("hashcodes::"+generator1.hashCode()+" "+generator2.hashCode());
		System.out.println(generator1==generator2);
		System.out.println("======================================================");
		
		WishMessageGenerator generator3=factory.getBean("wmg1",WishMessageGenerator.class);
		WishMessageGenerator generator4=factory.getBean("wmg1",WishMessageGenerator.class);
		System.out.println("hashcodes::"+generator3.hashCode()+" "+generator4.hashCode());

		
		System.out.println("==============================================");

		String result=generator1.generateMessage("Nilesh");
		System.out.println("Wish Message is:"+result);

	}

}
