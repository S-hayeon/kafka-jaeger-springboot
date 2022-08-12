package com.example.consumerservice.model;


import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "SIGNAL")
public class SignalInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String symbol;
	private String side; // LONG SHORT
	private String action; // BUY SELL
	private Float entryPrice;


}