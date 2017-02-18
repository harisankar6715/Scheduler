package com.calcus.scheduler.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "RoadTax")
public class RoadTax {

	@javax.persistence.Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int RId;
	private String To_Date;
	private String Expiry_Date;
	public int getRId() {
		return RId;
	}
	public void setRId(int rId) {
		RId = rId;
	}
	public String getTo_Date() {
		return To_Date;
	}
	public void setTo_Date(String to_Date) {
		To_Date = to_Date;
	}
	public String getExpiry_Date() {
		return Expiry_Date;
	}
	public void setExpiry_Date(String expiry_Date) {
		Expiry_Date = expiry_Date;
	}
	
}
