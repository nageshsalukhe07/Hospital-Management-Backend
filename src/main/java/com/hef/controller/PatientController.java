package com.hef.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hef.entity.Patient;
import com.hef.service.PatientService;

@RestController
@RequestMapping("/api/patients")

public class PatientController {

    @Autowired
    private PatientService pservice;

    @PostMapping("/save")
    public String addPatient(@RequestBody Patient patient) {
        return pservice.save(patient);
    }
    
    @PostMapping("/saveall")
    public String saveAll(@RequestBody List<Patient> plist) {
    	return pservice.saveAll(plist);
    }
    
    @GetMapping("/findall")
    public List<Patient> findAll() {
        return pservice.findAll();
    }

    @GetMapping("findbyid/{id}")
    public Optional<Patient> findById(@PathVariable int id) {
       
        return  pservice.findById(id);
    }

    @DeleteMapping("deletebyid/{id}")
    public String deletePatient(@PathVariable int id) {
      return pservice.deleteById(id);
    }
}
