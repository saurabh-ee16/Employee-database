package com.assignment.assignment5;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assignment.assignment5.model.Employee;
import com.assignment.assignment5.service.EmployeeService;

@SpringBootApplication
public class Assignment5Application {
	@Autowired
	EmployeeService empser;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Assignment5Application.class, args);
	}
	
	@PostConstruct
	public void init() {
		Employee emp1=new Employee((long) 105,"Shyam","shyan.gupta105@gmail.com","bangalore");
		Employee emp2=new Employee((long)106 , "priya","priya.777@gmail.com","pune");
		Employee emp3=new Employee((long)107 , "Shreenatham","shree.nath12@gmail.com","hyderabad");
		empser.addEmp((long)105, emp1);
		empser.addEmp((long) 106, emp2);
		empser.addEmp((long)107,emp3);
	
	}
	
}
