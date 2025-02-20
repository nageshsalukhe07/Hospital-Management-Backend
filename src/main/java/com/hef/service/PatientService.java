package com.hef.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hef.entity.Patient;
import com.hef.repository.PatientRepository;

@Service
public class PatientService {

    @Autowired
    private PatientRepository presp;
    
    public String save(Patient patient) {
    	presp.save(patient);
         return "Patient add successfully";
    }

    public String saveAll(List<Patient> plist) {
    	presp.saveAll(plist);
    	return "Patient list add successfully";
    }
    
    public List<Patient> findAll() {
        return presp.findAll();
    }

    public Optional<Patient> findById(int id) {
        return presp.findById(id);
    }


    public String deleteById(int id) {
    	presp.deleteById(id);
    	return "delete patient";
    }
}
