package com.example.Appointment.utility;

import java.time.LocalDate;
import java.time.LocalTime;

import com.example.Appointment.entity.Appointment;
import com.example.Appointment.uiRequest.AppointmentRequest;

public class AppointmentUtility {

	
	public static boolean isInvalidRequest(AppointmentRequest appointmentRequest) {

    	
    	LocalDate currentDate = LocalDate.now();
        LocalDate appointmentDate = LocalDate.parse(appointmentRequest.getAppointmentDate());
        LocalTime currentTime =LocalTime.now();
        LocalTime appointmentTime = LocalTime.parse(appointmentRequest.getAppointmentTime());

        if (appointmentDate.isBefore(currentDate)) {
            return true;
        }
        if(appointmentDate.isEqual(currentDate))
        {
        	if (appointmentTime.isBefore(currentTime)) {
                return true;
            }
        }
        if (appointmentRequest.getPatient() == null
    	           || appointmentRequest.getDoctorId() == null || appointmentRequest.getDoctorId().isEmpty()
    	           || appointmentRequest.getAppointmentDate() == null || appointmentRequest.getAppointmentDate().isEmpty()
    	            || appointmentRequest.getAppointmentTime() == null || appointmentRequest.getAppointmentTime().isEmpty()
    	           || appointmentRequest.getBookingAgentId() == null || appointmentRequest.getBookingAgentId().isEmpty()) 
    	 	{
    	       return true;
    	   }

       return false;
    }

	public static Appointment convertUiRequest(AppointmentRequest appointmentRequest) {
		// TODO Auto-generated method stub
		
		Appointment appointment = new Appointment();
		appointment.setPatient(appointmentRequest.getPatient());
		//appointment.setId(appointmentRequest.getBookingAgentId());
		appointment.setDoctorId(appointmentRequest.getDoctorId());
		appointment.setDepartment(appointmentRequest.getDepartment());
		appointment.setBookingAgentId(appointmentRequest.getBookingAgentId());
		appointment.setAppointmentTime(appointmentRequest.getAppointmentTime());
		appointment.setAppointmentDate(appointmentRequest.getAppointmentDate());
		appointment.setAppointmentStatus(appointmentRequest.getAppointmentStatus());
		appointment.setAdditionalNotes(appointmentRequest.getAdditionalNotes());
		return appointment;
		
	}

}
