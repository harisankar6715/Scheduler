package com.calcus.scheduler.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "Vehicle")
public class Vehicle {
	
	@javax.persistence.Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String Reg_No;
	private String Manufacture;
	private String Model;
	private String Year;
	
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getReg_No() {
		return Reg_No;
	}
	public void setReg_No(String reg_No) {
		Reg_No = reg_No;
	}
	public String getManufacture() {
		return Manufacture;
	}
	public void setManufacture(String manufacture) {
		Manufacture = manufacture;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	
	
	

}
