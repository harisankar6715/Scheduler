package com.calcus.scheduler.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "Owner")
public class Owner { 
	
	@javax.persistence.Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int OId;
	private String Name;
	private String Email_Id;
	private String Mobile;
	
	public int getOId() {
		return OId;
	}
	public void setOId(int oId) {
		OId = oId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String getEmail_Id() {
		return Email_Id;
	}
	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	
}
