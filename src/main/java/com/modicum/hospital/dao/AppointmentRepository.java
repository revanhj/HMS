package com.modicum.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modicum.hospital.modal.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, String>{

}
