package com.example.Appointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Appointment.entity.Doctor;


@Repository
public interface DoctorRepo extends JpaRepository<Doctor,Integer> {

}
