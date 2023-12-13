package com.niltech.controller;

import com.niltech.dto.EmployeeDTO;
import com.niltech.service.IEmployeeMgmtService;
import com.niltech.vo.EmployeeVO;

public class MainController {
	
	private IEmployeeMgmtService service;

	public MainController(IEmployeeMgmtService service) {
		System.out.println("MainController:: 1-param constructor");
		this.service = service;
	}
	
	public String processEmployee(EmployeeVO vo) throws Exception {
		// convert Vo class object to DTO
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setDesg(vo.getDesg());
		dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
		// use service
		String result = service.registerEmployee(dto);
		return result;
	}
	
	

}
