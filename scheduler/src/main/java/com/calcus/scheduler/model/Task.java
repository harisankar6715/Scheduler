package com.calcus.scheduler.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Task")
@Component
public class Task {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Task_Id;
	private String Title; 
	private String Description;
	private String Status; 
	private String Users_Id;
	//private Date Expiry;
	@ManyToOne
	@JoinColumn(name="Users_Id" , nullable = false, updatable = false, insertable = false)
	private Users users;
	
	public int getTask_Id() {
		return Task_Id;
	}
	public void setTask_Id(int task_Id) {
		Task_Id = task_Id;
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
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getUsers_Id() {
		return Users_Id;
	}
	public void setUsers_Id(String users_Id) {
		Users_Id = users_Id;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
//	public Date getExpiry() {
//		return Expiry;
//	}
//	public void setExpiry(Date expiry) {
//		Expiry = expiry;
//	}
	
	
	
	
}
