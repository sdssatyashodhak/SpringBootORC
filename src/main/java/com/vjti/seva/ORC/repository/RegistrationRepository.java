package com.vjti.seva.ORC.repository;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.vjti.seva.ORC.model.Registration;

public interface RegistrationRepository extends CrudRepository<Registration, Integer> {
	
	@Query("from Registration where city = ?1 order by fullname")
	List<Registration> findByCity(String City);

}
