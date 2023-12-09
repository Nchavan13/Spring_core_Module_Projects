package com.niltech.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.niltech.beans.WishMessageGenerator;
import com.niltech.ston.Printer;

public class SpringBeanScopeTest2 {
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/niltech/cfg/applicationContext.xml");
		
		Printer p1=factory.getBean("p1",Printer.class);
		Printer p2=factory.getBean("p1",Printer.class);
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		System.out.println(p1==p2);
		
		System.out.println("================================");
		
		Printer p3=factory.getBean("p",Printer.class);
		Printer p4=factory.getBean("p",Printer.class);
		System.out.println(p3.hashCode()+" "+p4.hashCode());

		
		
		

	}

}
