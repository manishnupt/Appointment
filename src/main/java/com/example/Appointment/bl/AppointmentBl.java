package com.example.Appointment.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Appointment.entity.Appointment;
import com.example.Appointment.service.AppointmentService;
import com.example.Appointment.uiRequest.AppointmentRequest;
import com.example.Appointment.utility.AppointmentUtility;

@Component
public class AppointmentBl {
	
	@Autowired
	AppointmentService service;

	public String bookAppointment(@RequestBody AppointmentRequest appointmentRequest) {
		if (AppointmentUtility.isInvalidRequest(appointmentRequest)) {
            return "Invalid request. Please provide all required fields.";
        }
		
		  Appointment appointment = AppointmentUtility.convertUiRequest(appointmentRequest);
		
		return service.bookAppointment(appointment);
		
	}

	
}
