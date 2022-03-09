package com.assignment.assignment5.model;


public class Employee {
	private Long id;
	private String empName;
	private String empEmail;
	private String empLoc;
	
	public Employee() {
		
	}
	
	public Employee(Long id,String empName,String empEmail,String empLoc) {
		this.id=id;
		this.empName=empName;
		this.empEmail=empEmail;
		this.empLoc=empLoc;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpLoc(String empLoc) {
		this.empLoc = empLoc;
	}
	public String getEmpLoc() {
		return empLoc;
	}
	@Override
	public String toString() {
		return "["+this.id+" , "+this.empName+" , "+this.empEmail+" , "+this.empLoc+"]" ;
	}
	
	
}
