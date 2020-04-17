package com.cap.deleteservice.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.deleteservice.dao.DeleteEmpDao;


  @Service
	@Transactional
	public class DeleteEmpServiceImpl implements DeleteEmpService {
		 
		  
		  @Autowired
		    private DeleteEmpDao dao;

		    public DeleteEmpDao getDao(){
		        return dao;
		    }
		  
			@Override
			public String deleteEmployee(Integer id) {
				boolean result=dao.existsById(id);
				if(result) {
					dao.deleteById(id);
					return "deleted the emp details";
				}
				else 
					return "id is not present";
			}

		
	}
