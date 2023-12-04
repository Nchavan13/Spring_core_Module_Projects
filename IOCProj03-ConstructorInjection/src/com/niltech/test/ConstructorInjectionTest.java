package com.niltech.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.niltech.beans.WishMessageGenerator;

public class ConstructorInjectionTest {
	public static void main(String[] args) {
//        FileSystemResource res = new FileSystemResource("src/main/java/com/niltech/cfg/applicationContext.xml");
//        XmlBeanFactory factory = new XmlBeanFactory(res);
		ApplicationContext context = new FileSystemXmlApplicationContext("applicationContext.xml");

		Object obj = context.getBean("wmg");
		Object obj1 = context.getBean("wmg");
//		System.out.println(obj.hashCode()+":"+obj1.hashCode());

		WishMessageGenerator generator = (WishMessageGenerator) obj;

		String result = generator.generateMessage("Nilesh");
		System.err.println("Wish Message is:" + result);

	}
}
