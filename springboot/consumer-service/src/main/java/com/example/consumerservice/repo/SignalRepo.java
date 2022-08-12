package com.example.consumerservice.repo;

import java.util.List;

import com.example.consumerservice.model.SignalInfo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;


@Qualifier("signalRepo")
@EnableJpaRepositories
public interface SignalRepo extends JpaRepository<SignalInfo, Long>{
}
