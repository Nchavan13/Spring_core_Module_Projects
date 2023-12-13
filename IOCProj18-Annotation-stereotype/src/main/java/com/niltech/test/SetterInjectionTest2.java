package com.niltech.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.niltech.beans.WishMessageGenerator;

public class SetterInjectionTest2 {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/niltech/cfg/applicationContext.xml");
		
		WishMessageGenerator generator=factory.getBean("wmg",WishMessageGenerator.class);
		String res=generator.generateMessage("Nilesh");
		System.out.println("Wish Message is::"+res);

	}
}
