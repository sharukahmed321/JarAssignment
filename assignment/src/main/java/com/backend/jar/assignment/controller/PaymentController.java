package com.backend.jar.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.jar.assignment.model.Payment;
import com.backend.jar.assignment.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	PaymentService paymentService; // business logic is written in services
	
	@GetMapping("/v1/payments")
	public List<Payment> getAllPayments(){
		return paymentService.getAllPayments();
	}
	
	@PostMapping("/v1/payments")
	public Payment createPayment(@RequestBody Payment payment) {
		return paymentService.createPayment(payment);
	}
	
}
