package com.plantasreyes.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.plantasreyes.database.entity.Payment;
import com.plantasreyes.database.service.PaymentService;


@RequestMapping(path ="/bookstore/payment")
@RestController
public class PaymentController {
	
	private final PaymentService PaymentService; 
		
		
		@Autowired
		
		public PaymentController(PaymentService paymentService) {
			this.PaymentService = paymentService; 
		}
		
		@GetMapping
		public List<Payment> getBooks(){
			return PaymentService.getPayment();
		}
		
}
