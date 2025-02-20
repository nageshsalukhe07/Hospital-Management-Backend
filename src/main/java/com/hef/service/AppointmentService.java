package com.hef.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hef.entity.Appointment;
import com.hef.repository.AppointmentRepository;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository aresp;
    
    public String saveAll(List<Appointment> alist) {
    	
    	aresp.saveAll(alist);
    	
    	return "Appointment list add successfully";
    }

    public String save(Appointment appointment) {
    	aresp.save(appointment);
        return "add Appointment";
   }
    
    public List<Appointment> findAll() {
        return aresp.findAll();
    }

    public Optional<Appointment> findById(int id) {
        return aresp.findById(id);
    }

    public String deleteById(int id) {
    	aresp.deleteById(id);
    	return "Appointment deleted";
    }
}

