package com.example.Appointment.uiRequest;

import org.springframework.stereotype.Component;

import com.example.Appointment.entity.Patient;

import lombok.Data;

@Data
@Component
public class AppointmentRequest {

	private Patient patient;
    private String doctorId;
    private String appointmentDate;
    public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAdditionalNotes() {
		return additionalNotes;
	}
	public void setAdditionalNotes(String additionalNotes) {
		this.additionalNotes = additionalNotes;
	}
	public String getBookingAgentId() {
		return bookingAgentId;
	}
	public void setBookingAgentId(String bookingAgentId) {
		this.bookingAgentId = bookingAgentId;
	}
	public String getAppointmentStatus() {
		return appointmentStatus;
	}
	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}
	private String appointmentTime;
    private String department;
    private String additionalNotes;
    private String bookingAgentId;
    private String appointmentStatus;
	
}
