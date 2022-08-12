package com.example.consumerservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.consumerservice.service.ConsumerService;

@RestController
@RequestMapping("/v1/signal")
public class ConsumerController {

	@Autowired
	private ConsumerService service;


	@GetMapping("/health/ready")
	@ResponseStatus(HttpStatus.OK)
	public void ready(){}


	@GetMapping("/health/live")
	@ResponseStatus(HttpStatus.OK)
	public void live(){}

	@GetMapping
	public ResponseEntity<?> getEventDtls() {

		try {
			return new ResponseEntity<>(service.getEventDetails(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(new Exception(e.getMessage()), HttpStatus.EXPECTATION_FAILED);
		}
	}

}
