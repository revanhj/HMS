package com.modicum.hospital.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modicum.hospital.dao.AppointmentRepository;
import com.modicum.hospital.modal.Appointment;

@RestController
@RequestMapping("appointment")
public class AppointmentController {
	
@Autowired
AppointmentRepository appointmentRepository;

@PostMapping("/save")
public ResponseEntity addAppointment(@Valid @RequestBody Appointment appointment) {
 Map<String,Object> map=new HashMap<>();
 appointment.setPatientId(UUID.randomUUID().toString().substring(26));
 Appointment a=appointmentRepository.save(appointment);
		if (a.equals(appointment)) 
 map.put("message", "inserted succesfully"); else map.put("message","not inserted");
		return ResponseEntity.ok(map);
}
}
