package com.calcus.scheduler.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "Reminder")
public class Reminder {

	@javax.persistence.Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String Title;
	private String Description;
	private String Date;
	private String Expiry_Date;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getExpiry_Date() {
		return Expiry_Date;
	}
	public void setExpiry_Date(String expiry_Date) {
		Expiry_Date = expiry_Date;
	} 
	
	
	
}
