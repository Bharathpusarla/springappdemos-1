package com.samples.s08springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.samples.s08springmvc.domain.Employee;

@Controller
public class ListController {

	@RequestMapping("/readlist")
	public ModelAndView sendList() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displaylist");

		List<Employee> emps = new ArrayList<>();

		Employee employee = new Employee();
		employee.setId(1234);
		employee.setName("Mary");
		employee.setSalary(5324);
		emps.add(employee);

		employee = new Employee();
		employee.setId(675);
		employee.setName("John");
		employee.setSalary(12000);
		emps.add(employee);

		employee = new Employee();
		employee.setId(983);
		employee.setName("Wilson");
		employee.setSalary(4500);
		emps.add(employee);
		
		modelAndView.addObject("employees", emps);

		return modelAndView;
	}

}
