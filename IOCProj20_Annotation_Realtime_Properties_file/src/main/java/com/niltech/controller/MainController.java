package com.niltech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.niltech.dto.EmployeeDTO;
import com.niltech.service.IEmployeeMgmtService;
import com.niltech.vo.EmployeeVO;

@Controller("controller")
public class MainController {
	
	@Autowired
	private IEmployeeMgmtService service;

	
	
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
