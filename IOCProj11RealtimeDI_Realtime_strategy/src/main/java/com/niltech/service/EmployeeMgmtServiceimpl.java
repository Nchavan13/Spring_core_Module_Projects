package com.niltech.service;

import com.niltech.bo.EmployeeBO;
import com.niltech.dao.IEmployeedao;
import com.niltech.dto.EmployeeDTO;

public class EmployeeMgmtServiceimpl implements IEmployeeMgmtService {
	
	private IEmployeedao dao;
	

	public EmployeeMgmtServiceimpl(IEmployeedao dao) {
		System.out.println("EmployeeMgmtServiceimpl::1-param contructor()");
		this.dao = dao;
	}



	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
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
