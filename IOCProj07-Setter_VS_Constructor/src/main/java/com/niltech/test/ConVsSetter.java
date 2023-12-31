package com.niltech.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.niltech.beans.Customer;
import com.niltech.beans.Emp1;
import com.niltech.beans.Student;

public class ConVsSetter {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/niltech/cfgs/applicationContext.xml");
		
		Emp1 emp1=factory.getBean("emp1",Emp1.class);
		System.out.println(emp1);
		System.out.println("====================================================");
		Emp1 emp2=factory.getBean("emp2",Emp1.class);
		System.out.println(emp2);
		
		System.out.println("====================================================");
		Emp1 emp3=factory.getBean("emp2",Emp1.class);
		System.out.println(emp3);
		
		System.out.println("=============================================");
		
		Student st1=factory.getBean("stud",Student.class);
		System.out.println(st1);
		System.out.println("===============================================");
		
		Customer cust1=factory.getBean("cust1",Customer.class);
		System.out.println(cust1);
		
		
	}

}
