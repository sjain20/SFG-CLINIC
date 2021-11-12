package com.sfg.clinic.sfgclinic.services;

import com.sfg.clinic.sfgclinic.model.Staff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface StaffService extends CrudRepository<Staff, Long> {
}
