package com.cap.addservice.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.addservice.dao.AddEmpDao;
import com.cap.addservice.dto.Employee;

@Service
@Transactional
public class AddEmpServiceImpl implements AddEmpService{

    @Autowired
    private AddEmpDao dao;

    public AddEmpDao getDao(){
        return dao;
    }

	@Override
	public String createEmployee(Employee emp) {
		dao.save(emp);
		return "registered successfully";
	}
}
