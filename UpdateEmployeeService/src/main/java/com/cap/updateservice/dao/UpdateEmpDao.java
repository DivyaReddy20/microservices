package com.cap.updateservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.updateservice.dto.Employee;

public interface UpdateEmpDao extends JpaRepository<Employee, Integer>{

}
