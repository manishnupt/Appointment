package com.example.Appointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Appointment.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {

}
