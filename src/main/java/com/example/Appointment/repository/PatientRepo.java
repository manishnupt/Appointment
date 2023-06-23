package com.example.Appointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Appointment.entity.Patient;


public interface PatientRepo extends JpaRepository<Patient,Integer> {
}
