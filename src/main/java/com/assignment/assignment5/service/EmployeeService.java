package com.assignment.assignment5.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.assignment.assignment5.model.Employee;
@Service
public class EmployeeService {
	
	private HashMap<Long, Employee> map=new HashMap<Long, Employee>();
	
	
	public void addEmp(Long id,Employee emp) {
		map.put(id, emp);
	}
	
	public HashMap<Long, Employee> getMap() {
		return map;
	}
	
	public Employee findbyId(Long id) {
		Employee emp=map.get(id);
		return emp;
	}
	
	public Employee updatebyId(Long id,Employee empnew,Employee empold) {
		empold.setEmpName(empnew.getEmpName());
		empold.setEmpEmail(empnew.getEmpEmail());
		empold.setEmpLoc(empnew.getEmpLoc());
		
		return empold;
		
	}

	public void deletebyId(Long id) {
		map.remove(id);
	}
	
	
	
	
}
