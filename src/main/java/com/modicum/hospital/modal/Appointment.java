package com.modicum.hospital.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "appointment")
@Data
public class Appointment {

	
	@Id
 	private String  patientId;
	private String patientName;
	private String mobileNumber;
	private String email;
	private String gender;
	private String department;
	private String dateTime;
	private String problem;
	
	  
	
}
