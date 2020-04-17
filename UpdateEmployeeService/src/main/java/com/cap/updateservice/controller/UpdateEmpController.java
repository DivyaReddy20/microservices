package com.cap.updateservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cap.updateservice.dto.Employee;
import com.cap.updateservice.service.UpdateEmpService;

@RestController
@RequestMapping("/emp")
@CrossOrigin("http://localhost:4200")
public class UpdateEmpController {
	@Autowired
	private UpdateEmpService empService;
	@Autowired
	RestTemplate rest;
	
	@RequestMapping("/update/{id}")
	public String updateEmp(@RequestBody Employee emp) {
		Employee employee=rest.getForObject("http://localhost:9093/emp/find/"+emp.getId(),Employee.class);
		if(employee!=null)
		{
			employee.setName(emp.getName());
			employee.setSal(emp.getSal());
			empService.updateEmployee(employee);
			return "employee updated";
			
		}
		else {
		return "emp does not exist"+emp.getId();
	}
}
}
