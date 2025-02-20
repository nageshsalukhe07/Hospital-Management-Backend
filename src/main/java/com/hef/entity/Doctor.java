package com.hef.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "doctors")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctorId;

	private String name;
	private String specialization;
	private int experience;
	private String desi;
	private String location;
	private String img;

	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Appointment> appointments = new ArrayList<>();


	public Doctor() {
		super();
	}

	public Doctor(String name, String specialization, int experience, String desi, String location,String img) {
		super();
		this.name = name;
		this.specialization = specialization;
		this.experience = experience;
		this.desi = desi;
		this.location=location;
		this.img=img;
		
	}

	public Doctor(int doctorId, String name, String specialization, int experience, String desi,
			String location,String img) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.specialization = specialization;
		this.experience = experience;
		this.desi = desi;
		this.location=location;
		this.img=img;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getDesi() {
		return desi;
	}

	public void setDesi(String desi) {
		this.desi = desi;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	

	
}
