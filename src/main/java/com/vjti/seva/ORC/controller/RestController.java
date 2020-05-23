package com.vjti.seva.ORC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.vjti.seva.ORC.model.Registration;
import com.vjti.seva.ORC.service.RegistrationService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@GetMapping("/registration")
	public String registration() {
	    System.out.println("Inside Registration method");
		Registration registration = new Registration(1, "abcd", "df", "01/02/1999", "oisdf", "sdff");
		System.out.println("Object created");
		registrationService.registerUser(registration);
		return "registration done";
	}

	@GetMapping("/healthCheck")
	public String check()
	{
		return "checked";
	}
	
}