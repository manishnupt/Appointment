package com.example.Appointment.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Appointment.entity.Doctor;
import com.example.Appointment.service.DoctorService;
import com.example.Appointment.uiRequest.DoctorUiRequest;
import com.example.Appointment.utility.DoctorHelper;

@Component
public class DoctorBl {
	
	
	@Autowired
	private DoctorService service;
	
	
	public String addDoctor(DoctorUiRequest req)
	{
		Doctor d=DoctorHelper.convertDoctorUiRequest(req);
		return service.addDoctor(d);
	}

}
