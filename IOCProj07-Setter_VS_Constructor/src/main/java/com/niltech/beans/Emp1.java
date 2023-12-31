package com.niltech.beans;

public class Emp1 {
	private int eno;
	private String ename;
	private float billAmt;

	public Emp1(int eno, String ename, float billAmt) {
		System.out.println("Emp1::3-param constructor");
		this.eno = eno;
		this.ename = ename;
		this.billAmt = billAmt;
	}
	
	public Emp1(int eno, String ename) {
		System.out.println("Emp1::2-param constructor");
		this.eno = eno;
		this.ename = ename;
	}
	
	public Emp1(int eno,  float billAmt) {
		System.out.println("Emp1::2-param constructor");
		this.eno = eno;
		this.billAmt = billAmt;
	}
	
	public Emp1(String ename, float billAmt) {
		System.out.println("Emp1::2-param constructor");
		this.ename = ename;
		this.billAmt = billAmt;
	}
	
	public Emp1( String ename) {
		System.out.println("Emp1::1-param constructor");
		this.ename = ename;
	}
	
	public Emp1( int eno) {
		System.out.println("Emp1.1-param constructor");
		this.eno = eno;
	}
	
	public Emp1(float billAmt) {
		System.out.println("Emp1::3-param constructor");
		this.billAmt = billAmt;
	}
	
	
	

	@Override
	public String toString() {
		return "Emp1 [eno=" + eno + ", ename=" + ename + ", Bill=" + billAmt + "]";
	}
	
	
	
	
	

}
