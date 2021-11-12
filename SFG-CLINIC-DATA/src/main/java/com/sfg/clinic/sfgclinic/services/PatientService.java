package com.sfg.clinic.sfgclinic.services;

import com.sfg.clinic.sfgclinic.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface PatientService extends CrudRepository<Person, Long> {
}
