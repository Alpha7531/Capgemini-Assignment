package com.doctor.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.doctor.models.Doctor;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, Long> {

	Doctor findByUsername(String username);

}
