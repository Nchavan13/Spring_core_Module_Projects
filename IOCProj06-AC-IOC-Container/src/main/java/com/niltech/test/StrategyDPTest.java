package com.niltech.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.niltech.comp.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("com/niltech/common/applicationContext.xml");

		Flipkart fpkt = factory.getBean("fpkt", Flipkart.class);

		String result = fpkt.shopping(new String[] { "shirt", "trouser", "glasses" },

				new float[] { 123.22f, 15462.215f, 55555.5555f });

		System.out.println(result);
	}

}
