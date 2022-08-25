package com.samples.s08springmvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.samples.s08springmvc.domain.User;

@Controller
public class UserController {

	@RequestMapping("/register")
	public String showRegistrationPage() {
		return "userreg";
	}
	
//	@RequestMapping(value="/registeruser", method=RequestMethod.GET)
//	public ModelAndView registerUser(@ModelAttribute("user") User user) {
//		System.out.println("User object retrieved from UI = " + user);
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("userfromcontroller", user);
//		mv.setViewName("userregresult");
//		return mv;
//	}
	
	@RequestMapping(value="/registeruser", method=RequestMethod.GET)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		
		System.out.println("User object retrieved from UI = " + user);
		
		model.addAttribute("userfromcontroller", user);
		
		return "userregresult";
		
	}
}
