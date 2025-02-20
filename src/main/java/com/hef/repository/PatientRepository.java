package com.hef.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hef.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}

