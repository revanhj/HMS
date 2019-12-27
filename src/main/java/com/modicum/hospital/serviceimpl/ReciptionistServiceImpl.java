package com.modicum.hospital.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modicum.hospital.dao.AppointmentRepository;
import com.modicum.hospital.modal.Appointment;
import com.modicum.hospital.service.ReceptionistService;
@Service
public class ReciptionistServiceImpl implements ReceptionistService{

	
	@Autowired
	AppointmentRepository appointmentRepository;
	@Override
	public Map<String, Object> addAppointment(Appointment appointment) {
		Map<String, Object> map=new HashMap<String,Object>();
 		map.put("message", appointmentRepository.save(appointment));
 		map.put("status", "1");
		return map;
	}

}
