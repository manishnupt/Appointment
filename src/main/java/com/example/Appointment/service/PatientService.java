package com.example.Appointment.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Appointment.entity.Patient;
import com.example.Appointment.repository.PatientRepo;

@Service
public class PatientService {

    @Autowired
    PatientRepo PatientRepo;

    public String createPatient(Patient patient)
    {
       Patient p=PatientRepo.save(patient);
       if(p!= null)
       {
    	   return "Success";
       }
       else
       {
    	   return "failure";
       }
    }
}
