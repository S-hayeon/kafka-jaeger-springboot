package com.example.consumerservice.service;

import java.util.List;

import com.example.consumerservice.model.SignalInfo;
import com.example.consumerservice.repo.SignalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.consumerservice.model.SignalInfo;
import com.example.consumerservice.repo.SignalRepo;

@Service
public class ConsumerService {

	@Autowired(required = true)
	@Qualifier("signalRepo")
	private SignalRepo signalRepo;

	public List<SignalInfo> getEventDetails() {

		try {
			return signalRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
