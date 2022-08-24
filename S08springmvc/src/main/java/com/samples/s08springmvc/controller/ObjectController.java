package com.samples.s08springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.samples.s08springmvc.domain.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/readobject")
	public ModelAndView sendObject() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayobject");
		
		Employee employee = new Employee();
		employee.setId(1234);
		employee.setName("Mary");
		employee.setSalary(5324);
		
		modelAndView.addObject("employee", employee);
		
		return modelAndView;
		
	}
	
}
