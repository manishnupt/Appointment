package com.example.Appointment.utility;

import java.util.ArrayList;
import java.util.List;

import com.example.Appointment.entity.Doctor;
import com.example.Appointment.uiRequest.DoctorUiRequest;

public class DoctorHelper {

	public static List<String> getAvailableSlots(Doctor d) {
		List<String> availableSlots = new ArrayList<>();

		int startingHourInt = d.getStartingHourInt();
		int startingMinuteInt = d.getStartingMinuteInt();
		int endingHourInt = d.getEndingHourInt();
		int endingMinuteInt = d.getEndingMinuteInt();
		int breakStartHourInt = d.getBreakStartHourInt();
		int breakStartMinuteInt = d.getBreakStartMinuteInt();
		int breakEndHourInt = d.getBreakEndHourInt();
		int breakEndMinuteInt = d.getBreakEndMinuteInt();

		int currentHour = startingHourInt;
		int currentMinute = startingMinuteInt;

		while (currentHour < endingHourInt || (currentHour == endingHourInt && currentMinute < endingMinuteInt)) {
			if ((currentHour < breakStartHourInt
					|| (currentHour == breakStartHourInt && currentMinute < breakStartMinuteInt))
					|| (currentHour > breakEndHourInt
							|| (currentHour == breakEndHourInt && currentMinute >= breakEndMinuteInt))) {
				availableSlots.add(String.format("%02d:%02d", currentHour, currentMinute));
			}

			currentMinute += 30;
			if (currentMinute >= 60) {
				currentMinute -= 60;
				currentHour++;
			}
		}

		return availableSlots;
	}

	public static Doctor convertDoctorUiRequest(DoctorUiRequest req) {
		// TODO Auto-generated method stub
		Doctor d = new Doctor();
		d.setName(req.getName());
		d.setSpeciality(req.getSpeciality());
		d.setStartingHour(req.getStartingHour());
		d.setEndingHour(req.getEndingHour());
		d.setBreakStartHour(req.getBreakStartHour());
		d.setBreakEndHour(req.getBreakEndHour());
		return d;

	}
}
