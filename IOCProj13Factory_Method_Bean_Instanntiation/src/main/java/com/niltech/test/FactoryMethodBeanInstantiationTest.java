package com.niltech.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodBeanInstantiationTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/niltech/cfgs/applicationContext.xml");
		
		Class clazz=factory.getBean("c1",Class.class);
		System.out.println(clazz.getClass());
		System.out.println(clazz.toString());
		System.out.println("=============================");
		
		Calendar cal=factory.getBean("cal",Calendar.class);
		System.out.println("Cal object class name:"+cal.getClass());
		System.out.println("cal object data:"+cal.toString());
		System.out.println("============================");
		
		Properties props=factory.getBean("props",Properties.class);
		
		System.out.println("props object class name:"+props.getClass());
		System.out.println("props object data:"+props.toString());
		System.out.println("=====================================");
		
		String s2=factory.getBean("s2",String.class);
		
		System.out.println("s2 object class name:"+s2.getClass());
		System.out.println("s2 object data:"+s2.toString());
	}

}
