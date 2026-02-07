package com.ajay.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface EmployeeService {
	public UserDetails checkAuthentication(String email, String pwd);
}
