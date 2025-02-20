package com.hef.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hef.entity.Appointment;
import com.hef.service.AppointmentService;

@RestController
@RequestMapping("/api/appointments")
@CrossOrigin(origins="http://localhost:3000")
public class AppointmentController {

	@Autowired
	private AppointmentService aservice;

	@PostMapping("/save")
	public String save(@RequestBody Appointment appointment) {
		return aservice.save(appointment);
	}

	@PostMapping("/saveall")
	public String saveAll(@RequestBody List<Appointment> alist) {

		return aservice.saveAll(alist);

	}

	@GetMapping("/findall")
	public List<Appointment> findAll() {
		return aservice.findAll();
	}

	@GetMapping("findbyid/{id}")
	public Optional<Appointment> findById(@PathVariable int id) {
		return aservice.findById(id);
	}

	@DeleteMapping("deletebyid/{id}")
	public String deleteAppointment(@PathVariable int id) {

		return aservice.deleteById(id);
	}
}