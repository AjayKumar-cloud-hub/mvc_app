package com.ajay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/")
	public String showMsg() {
		System.out.println("Welcome");
		return "welcome";
	}
	
//	@PostMapping("/login")
//	public String showHome(@ModelAttribute("login") Employee emp ) {
//		empService.checkAuthentication(emp.getEmail(),emp.getPwd());
//		System.out.println("Authentication Done");
//		return "show";
//	}

	}
