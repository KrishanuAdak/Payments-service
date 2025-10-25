package com.example.demo.security.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class ConsumeAppointments {
	@KafkaListener(topics="update-appointment-by-doctor",groupId="payments-group")
	public void consumeAppointmentStatus(String message){
		
	System.out.println(message);
		
	}

}
