package com.niltech.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.niltech.beans.A;
import com.niltech.beans.B;

public class CyclicDITest {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/niltech/cfgs/applicationContext.xml");

		
		A oa = factory.getBean("a1", A.class);
		System.out.println(oa);
		System.out.println("==================================");

		B ob = factory.getBean("b1", B.class);
		System.out.println(ob);
	}

}
