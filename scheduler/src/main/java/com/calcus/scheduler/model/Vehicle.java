package com.calcus.scheduler.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	
//	@ManyToOne
//	@JoinColumn(name="Owner_id")
//	private Owner owner;
	
//	@OneToMany(mappedBy="vehicle")
//	private Set<Fitness> fitness; 
//	
//	@OneToMany(mappedBy="vehicle")
//	private Set<Insurance> insurance; 
//	
//	@OneToMany(mappedBy="vehicle")
//	private Set<Permit> permit; 
//	
//	@OneToMany(mappedBy="vehicle")
//	private Set<Pollution> pollution; 
//	
//	@OneToMany(mappedBy="vehicle")
//	private Set<RoadTax> roadTax;
	
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
//	public Owner getOwner() {
//		return owner;
//	}
//	public void setOwner(Owner owner) {
//		this.owner = owner;
//	}
//	public Set<Fitness> getFitness() {
//		return fitness;
//	}
//	public void setFitness(Set<Fitness> fitness) {
//		this.fitness = fitness;
//	}
//	public Set<Insurance> getInsurance() {
//		return insurance;
//	}
//	public void setInsurance(Set<Insurance> insurance) {
//		this.insurance = insurance;
//	}
//	public Set<Permit> getPermit() {
//		return permit;
//	}
//	public void setPermit(Set<Permit> permit) {
//		this.permit = permit;
//	}
//	public Set<Pollution> getPollution() {
//		return pollution;
//	}
//	public void setPollution(Set<Pollution> pollution) {
//		this.pollution = pollution;
//	}
//	public Set<RoadTax> getRoadTax() {
//		return roadTax;
//	}
//	public void setRoadTax(Set<RoadTax> roadTax) {
//		this.roadTax = roadTax;
//	}
	
	
	

}
