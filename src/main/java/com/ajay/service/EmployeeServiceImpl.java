package com.ajay.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.ajay.entity.Employee;
import com.ajay.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo empRepo;
	
	@Override
	public UserDetails checkAuthentication(String email, String pwd) {
		
		Employee emp = empRepo.findByEmail(email,pwd);
		 
		return org.springframework.security.core.userdetails.User
				.withUsername(emp.getEmail())
				.password(emp.getPwd())
				.roles(emp.getRole())
				.build()
				;
	}

}
