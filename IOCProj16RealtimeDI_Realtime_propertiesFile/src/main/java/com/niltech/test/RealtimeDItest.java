package com.niltech.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niltech.controller.MainController;
import com.niltech.vo.EmployeeVO;

public class RealtimeDItest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/niltech/cfgs/applicationContext.xml");
		
		MainController controller=ctx.getBean("controller",MainController.class);
		//read input as string value and store them into emo vo
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee name::");
		String name=sc.next();
		System.out.println("Enter Employee Designation::");
		String desg=sc.next();
		System.out.println("Enter Employee Basic Salary::");
		String basicSalary=sc.next();
		EmployeeVO vo=new EmployeeVO();
		vo.setDesg(desg);
		vo.setBasicSalary(basicSalary);
		vo.setEname(name);
		//invoke method
		
		try {
			String result=controller.processEmployee(vo);
			System.out.println(result);
			
		}catch (Exception e) {
//			e.printStackTrace();
			System.out.println("Internal problem::"+e.getMessage());
		}
		System.out.println(System.getProperties());
	}

}
