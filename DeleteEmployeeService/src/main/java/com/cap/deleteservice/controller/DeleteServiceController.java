package com.cap.deleteservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cap.deleteservice.dto.Employee;
import com.cap.deleteservice.service.DeleteEmpService;

@RestController
@RequestMapping("/emp")
@CrossOrigin("http://localhost:4200")
public class DeleteServiceController {
@Autowired
private DeleteEmpService empService;
@Autowired
RestTemplate rest;

@DeleteMapping("/deleteEmp/{id}")
public String updateEmp(@PathVariable Integer id) {
	Employee e=rest.getForObject("http://localhost:9093/emp/find/"+id,Employee.class);
	if(e!=null)
	{
		empService.deleteEmployee(id);
		return "employee deleted";
		
	}
	else {
	return "emp does not exist";
}
}
}