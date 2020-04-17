package com.cap.updateservice.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Empms1")
public class Employee {
	@Id
	private int id;
	private int sal;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, int sal, String name) {
		super();
		this.id = id;
		this.sal = sal;
		this.name = name;
	}
	public Employee() {
		
	}

}
