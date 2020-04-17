package com.cap.fetchservice.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.fetchservice.dao.FetchEmpDao;
import com.cap.fetchservice.dto.Employee;

@Service
	@Transactional
public class FetchEmpServiceImpl implements FetchEmpService {
	 @Autowired
	    private FetchEmpDao dao;

	    public FetchEmpDao getDao(){
	        return dao;
	    }
	    @Override
	public Object findEmployee(Integer id) {
	
		return dao.findById(id);
				}


}
