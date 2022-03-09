package com.assignment.assignment5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.assignment.assignment5.model.Employee;
import com.assignment.assignment5.service.EmployeeService;

@Controller
public class employeeController {
	
	@Autowired
	EmployeeService empser;
	
	@RequestMapping("/addDetails")
	public String addDetails() {
		return "addDetails";		
	}
	
	@RequestMapping(value="/addAccount",method = RequestMethod.POST)
	public ModelAndView addAccount(@ModelAttribute("empid") Long id,@ModelAttribute("empname")
	String name,@ModelAttribute("email") String email,@ModelAttribute("emploc") String loc) {
		Employee emp=new Employee(id,name,email,loc);
		empser.addEmp(id, emp);
		ModelAndView mv=new ModelAndView();
		mv.addObject("service", "added");
		mv.addObject("key", name);
		mv.setViewName("success");
		System.out.println(empser.getMap());
		return mv;
	}
	
	@RequestMapping("/displayAll")
	public ModelAndView displayAll() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("map", empser.getMap());
		mv.setViewName("displayAll");
		
		return mv;
	}
	@ResponseBody
	@RequestMapping(value="/display/{id}")
	public String displaybyId(@ModelAttribute("id") long id) {
		return empser.findbyId(id).toString();	
	}
	
	
	
	@PutMapping(value="/update/{id}")
	public Employee updateEmp(@RequestBody Employee emp,@PathVariable Long id) {
		if(empser.findbyId(id)!=null) {
			return empser.updatebyId(id, emp,empser.findbyId(id));
			
		}
		
		else {
			empser.addEmp(id, emp);
			return emp;
		}
		
	}
		
	@DeleteMapping("/delete/{id}")
	public String deletebyId(@PathVariable Long id) {
		empser.deletebyId(id);
		return "deleted";
	}
	
	
	
}
