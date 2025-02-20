package com.hef.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hef.entity.Doctor;
import com.hef.service.DoctorService;

@RestController
@RequestMapping("/api/doctors")
@CrossOrigin(origins="http://localhost:3000")
public class DoctorController {

    @Autowired
    private DoctorService dservice;

    @PostMapping("/save")
    public String save(@RequestBody Doctor doctor) {
        return dservice.save(doctor);
    }
    
    @GetMapping("/findall")
    public List<Doctor> findAll() {
        return dservice.findAll();
    }

    @GetMapping("findbyid/{id}")
    public Optional<Doctor> findById(@PathVariable int id) {
    	return dservice.findById(id);
    }
    
    @PutMapping("/update/{id}")
    public String update(@PathVariable int id,@RequestBody Doctor d1) {
    	return dservice.update(id, d1);
    }
 
    @DeleteMapping("deletebyid/{id}")
    public String deleteById(@PathVariable int id) {
        return dservice.deleteById(id);
    }
}
