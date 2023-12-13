package com.niltech.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.niltech.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
//        FileSystemResource res = new FileSystemResource("src/main/java/com/niltech/cfg/applicationContext.xml");
//        XmlBeanFactory factory = new XmlBeanFactory(res);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/niltech/cfg/applicationContext.xml");

		WishMessageGenerator generator=context.getBean("wmg",WishMessageGenerator.class);
		/*
		 * System.out.println(generator.hashCode());
		 * System.out.println(generator1.hashCode());
		 */
		
		//System.out.println("Spring bean count:"+context.getBeanDefinitionCount());

		String result = generator.generateMessage("Nilesh");
		System.err.println("Wish Message is:" + result);

	}
}
