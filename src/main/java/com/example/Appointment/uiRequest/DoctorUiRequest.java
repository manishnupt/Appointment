package com.example.Appointment.uiRequest;

public class DoctorUiRequest {
	
	//private Long id;
	private String name;
	private String speciality;
	private String endingHour;
	private String breakStartHour;
	private String breakEndHour;
	private String startingHour;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getStartingHour() {
		return startingHour;
	}
	public void setStartingHour(String startingHour) {
		this.startingHour = startingHour;
	}
	public String getEndingHour() {
		return endingHour;
	}
	public void setEndingHour(String endingHour) {
		this.endingHour = endingHour;
	}
	public String getBreakStartHour() {
		return breakStartHour;
	}
	public void setBreakStartHour(String breakStartHour) {
		this.breakStartHour = breakStartHour;
	}
	public String getBreakEndHour() {
		return breakEndHour;
	}
	public void setBreakEndHour(String breakEndHour) {
		this.breakEndHour = breakEndHour;
	}


}
