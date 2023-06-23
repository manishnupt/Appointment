package com.example.Appointment.utility;

import com.example.Appointment.entity.Patient;
import com.example.Appointment.uiRequest.PatientRequest;

public class PatientHelper {

    public static Patient convertPatientRequest(PatientRequest req)
    {
        Patient p = new Patient();

       // p.setEmail(req.getEmail());
        p.setName(req.getName());
        p.setPhone(req.getPhone());
        p.setEmail(req.getEmail());
        p.setPolicyNumber(req.getPolicyNumber());
        p.setInsuranceProvider(req.getInsuranceProvider());

        return p;

    }


}
