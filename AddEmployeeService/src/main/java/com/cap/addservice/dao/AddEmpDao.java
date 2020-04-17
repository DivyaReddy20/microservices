package com.cap.addservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.addservice.dto.Employee;

public interface AddEmpDao extends JpaRepository<Employee, Integer> {

}

