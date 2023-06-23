package com.example.Appointment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String speciality;

	private String startingHour;
	private String endingHour;
	private String breakStartHour;
	private String breakEndHour;


	public Doctor(Long id, String name, String speciality, String startingHour, String endingHour,
			String breakStartHour, String breakEndHour) {
		super();
		this.id = id;
		this.name = name;
		this.speciality = speciality;
		this.startingHour = startingHour;
		this.endingHour = endingHour;
		this.breakStartHour = breakStartHour;
		this.breakEndHour = breakEndHour;
	}
public Doctor()
{
	
}
	
	

	// Getters and setters`

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getStartingHourInt() {
		return Integer.parseInt(startingHour.substring(0, 2));
	}

	public int getStartingMinuteInt() {
		return Integer.parseInt(startingHour.substring(2, 4));
	}

	public int getEndingHourInt() {
		return Integer.parseInt(endingHour.substring(0, 2));
	}

	public int getEndingMinuteInt() {
		return Integer.parseInt(endingHour.substring(2, 4));
	}

	public int getBreakStartHourInt() {
		return Integer.parseInt(breakStartHour.substring(0, 2));
	}

	public int getBreakStartMinuteInt() {
		return Integer.parseInt(breakStartHour.substring(2, 4));
	}

	public int getBreakEndHourInt() {
		return Integer.parseInt(breakEndHour.substring(0, 2));
	}

	public int getBreakEndMinuteInt() {
		return Integer.parseInt(breakEndHour.substring(2, 4));
	}
}
