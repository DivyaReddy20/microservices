package com.cap.updateservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.updateservice.dao.UpdateEmpDao;
import com.cap.updateservice.dto.Employee;

@Service
public class UpdateEmpServiceImpl implements UpdateEmpService{
	@Autowired
	private UpdateEmpDao empDao;
	@Override
	public String updateEmployee(Employee emp) {
	empDao.save(emp);
	return "Employee data updated";
	
		
	}

}