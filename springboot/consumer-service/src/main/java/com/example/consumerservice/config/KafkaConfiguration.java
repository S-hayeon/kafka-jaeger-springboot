package com.example.consumerservice.config;

import com.example.consumerservice.model.SignalInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.google.gson.Gson;
import com.example.consumerservice.model.SignalInfo;
import com.example.consumerservice.repo.SignalRepo;

@Configuration
public class KafkaConfiguration {
    @Autowired(required = true)
    @Qualifier("signalRepo")
    private SignalRepo signalRepo;

    @KafkaListener(id = "myid", topics = "trading")
    public void listen(String in) {
        System.out.println("consumed message==" + in);
        Gson g = new Gson();
        try {
            SignalInfo event = g.fromJson(in, SignalInfo.class);
            signalRepo.save(event);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
