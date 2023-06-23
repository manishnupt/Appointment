package com.example.Appointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Appointment.bl.PatientBl;
import com.example.Appointment.uiRequest.PatientRequest;

@RestController
@RequestMapping("/api/patient")
public class PatientController {
	
	@Autowired
	PatientBl bl;
	
	  
	  @PostMapping("/createPatient") 
	  public String createPatient(@RequestBody PatientRequest patientRequest) {
		  return bl.createPatient(patientRequest);
	  }
	 

}
