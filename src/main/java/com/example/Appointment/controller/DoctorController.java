package com.example.Appointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Appointment.bl.DoctorBl;
import com.example.Appointment.uiRequest.DoctorUiRequest;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
	
//addDoctor
//checkDoctorAvaibility
//manageDoctorTiming

	
	@Autowired
	private DoctorBl bl;
	
	@PostMapping("/addDoctor")
	public String addDoctor(@RequestBody DoctorUiRequest req)
	{
		return bl.addDoctor(req);
		//return null;
	}
	
	
	

}
