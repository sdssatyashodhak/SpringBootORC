/*package com.vjti.seva.ORC.controller;

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
		Registration registration = new Registration(0, null, null, null, null, null);
		registrationService.registerUser(registration);
		return "registration done";
	}

}
*/