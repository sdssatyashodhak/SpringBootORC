package com.vjti.seva.ORC.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.vjti.seva.ORC.model.Registration;
import com.vjti.seva.ORC.repository.RegistrationRepository;

@Service
@Transactional
public class RegistrationService {
	
	private final RegistrationRepository registrationRepository;
	
	public RegistrationService(RegistrationRepository registrationRepository) {
		this.registrationRepository = registrationRepository;
	}



	public void registerUser(Registration registration) {
		System.out.println("Inside registerUser");
		registrationRepository.save(registration);
		System.out.println("SAVED!!!");
	}

}
