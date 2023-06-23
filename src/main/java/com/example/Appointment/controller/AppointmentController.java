package com.example.Appointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Appointment.bl.AppointmentBl;
import com.example.Appointment.uiRequest.AppointmentRequest;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {
	
	
	@Autowired
	AppointmentBl bl;

    @PostMapping("/book")
    public String bookAppointment(@RequestBody AppointmentRequest appointmentRequest) {
       
        
    	return bl.bookAppointment(appointmentRequest);

       // return ResponseEntity.ok("Appointment booked successfully");
    }

    
}