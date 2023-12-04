package com.niltech.beans;

public class Customer {
	// mandatory
	private int cno;
	private String cname;
	private float billAmt;

	// optional
	private String address;
	private long mobile;

	public Customer(int cno, String cname, float billAmt) {
		System.out.println("Customer::3-param constructor");
		this.cno = cno;
		this.cname = cname;
		this.billAmt = billAmt;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", billAmt=" + billAmt + ", address=" + address
				+ ", mobile=" + mobile + "]";
	}
	
	

}
