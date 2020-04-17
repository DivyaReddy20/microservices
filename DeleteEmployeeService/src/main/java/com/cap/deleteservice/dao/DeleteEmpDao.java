package com.cap.deleteservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.deleteservice.dto.Employee;



public interface DeleteEmpDao extends JpaRepository<Employee, Integer>  {

}
