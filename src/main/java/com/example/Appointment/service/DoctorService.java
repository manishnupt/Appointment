package com.example.Appointment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Appointment.entity.Doctor;
import com.example.Appointment.repository.DoctorRepo;


@Component
public class DoctorService {

	
	@Autowired
	DoctorRepo repo;
	
	public String addDoctor(Doctor d) {
		Doctor doctor= repo.save(d);
		//System.out.println(DoctorHelper.getAvailableSlots(doctor));
		
		if(doctor!=null)
		{
			return "Success";
		}
		return "Failure";
	}

}
