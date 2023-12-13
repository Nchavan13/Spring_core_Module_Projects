package com.niltech.service;

import com.niltech.bo.EmployeeBO;
import com.niltech.dao.IEmployeedao;
import com.niltech.dto.EmployeeDTO;

public class EmployeeMgmtServiceimpl implements IEmployeeMgmtService {
	
	private IEmployeedao dao;
	private String osName;
	private String path;
	
	

	public void setOsName(String osName) {
		System.out.println("EmployeeMgmtServiceimpl.setOsName()");
		this.osName = osName;
	}



	public void setPath(String path) {
		System.out.println("EmployeeMgmtServiceimpl.setPath()");
		this.path = path;
	}



	public EmployeeMgmtServiceimpl(IEmployeedao dao) {
		System.out.println("EmployeeMgmtServiceimpl::1-param contructor()");
		this.dao = dao;
	}



	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		
		System.out.println("OS Name:"+osName);
		System.out.println("Path:"+path);
		// Business logic

		float grossSal = dto.getBasicSalary() + dto.getBasicSalary() * 0.4f;
		float netSal = grossSal - dto.getBasicSalary() * 0.2f;

		// prepare Bo class object having persistable data
		EmployeeBO bo = new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setDesg(dto.getDesg());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grossSal);
		bo.setNetSalary(netSal);
		// use DAO
		int count = dao.insertEmployee(bo);
		// generate result
		return count == 1 ? "Employee registered with netSalary::" + netSal
				: "Employee not registered with netSalary::" + netSal;

	}

}
