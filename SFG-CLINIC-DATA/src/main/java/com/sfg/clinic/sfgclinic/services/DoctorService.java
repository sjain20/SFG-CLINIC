package com.sfg.clinic.sfgclinic.services;

import com.sfg.clinic.sfgclinic.model.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface DoctorService extends CrudRepository<Doctor, Long> {
}
