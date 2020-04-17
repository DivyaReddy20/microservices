package com.cap.fetchservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.fetchservice.dto.Employee;

public interface FetchEmpDao extends JpaRepository<Employee, Integer>{

}
