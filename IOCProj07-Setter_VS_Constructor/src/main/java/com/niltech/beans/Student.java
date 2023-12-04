package com.niltech.beans;

public class Student {
	private String name;
	private String college;
	private int age;
	private String qt;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setQt(String qt) {
		this.qt = qt;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", college=" + college + ", age=" + age + ", qt=" + qt + "]";
	}
	
	

}
