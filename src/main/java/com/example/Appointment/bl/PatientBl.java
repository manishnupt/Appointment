package com.example.Appointment.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Appointment.entity.Patient;
import com.example.Appointment.service.PatientService;
import com.example.Appointment.uiRequest.PatientRequest;
import com.example.Appointment.utility.PatientHelper;

@Component
public class PatientBl {


    @Autowired
    PatientService service;

    public String createPatient(PatientRequest req)
    {
        Patient p =PatientHelper.convertPatientRequest(req);
       return service.createPatient(p);
        //return null;
    }
	

}
