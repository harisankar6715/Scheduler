package com.calcus.scheduler.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "Owner")
public class Owner { 
	
	@javax.persistence.Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String Name;
	private String Email;
	private String Mobile;
//	@OneToMany(mappedBy="owner")
//	private Set<Vehicle> vehicle;

	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
//	public Set<Vehicle> getVehicle() {
//		return vehicle;
//	}
//	public void setVehicle(Set<Vehicle> vehicle) {
//		this.vehicle = vehicle;
//	}
	

	
}
