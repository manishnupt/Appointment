package com.example.Appointment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Appointment.entity.Appointment;
import com.example.Appointment.repository.AppointmentRepository;
import com.example.Appointment.uiRequest.AppointmentRequest;

@Service
public class AppointmentService {
	
	@Autowired
	AppointmentRepository repo;

	public String bookAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		
		Appointment app=repo.save(appointment);	
		if(app!=null)
		{
			return "Success";
		}
		return "Failure";
	}
	
	
	

}
