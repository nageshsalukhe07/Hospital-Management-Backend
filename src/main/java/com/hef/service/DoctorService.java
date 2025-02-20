package com.hef.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hef.entity.Doctor;
import com.hef.repository.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository dresp;

	public String save(Doctor doctor) {
		dresp.save(doctor);
		return "Doctor add successfully";
	}

	public String saveAll(List<Doctor> dlist) {
		dresp.saveAll(dlist);
		return "Doctor list add Successfully";
	}

	public List<Doctor> findAll() {
		return dresp.findAll();
	}

	public Optional<Doctor> findById(int id) {
		return dresp.findById(id);
	}

	public String update(int id, Doctor d1) {

		Doctor d2=dresp.findById(id).orElse(null);
		
		if(d1!=null) {
			
			if(d1.getDoctorId()!=0) {
				d2.setDoctorId(d1.getDoctorId());
			}
			if(d1.getName()!=null) {
				d2.setName(d1.getName());
			}
			if(d1.getDesi()!=null) {
				d2.setDesi(d1.getDesi());
			}
			if(d1.getExperience()!=0) {
				d2.setExperience(d1.getExperience());
			}
			if(d1.getLocation()!=null) {
				d2.setLocation(d1.getLocation());
			}
			if(d1.getSpecialization()!=null) {
				d2.setSpecialization(d1.getSpecialization());
			}if(d1.getImg()!=null) {
				d2.setImg(d1.getImg());
			}
			
			
			
		}
		dresp.save(d2);
		
		return "update successfully";
	}

	public String deleteById(int id) {
		dresp.deleteById(id);
		return "doctor deleted";
	}
}
