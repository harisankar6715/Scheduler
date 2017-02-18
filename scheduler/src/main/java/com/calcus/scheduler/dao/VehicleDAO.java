package com.calcus.scheduler.dao;

import java.util.List;

import com.calcus.scheduler.model.Vehicle;



public interface VehicleDAO {
	
	void saveOrUpdate(Vehicle vehicle);
	void delete(int Id);
	public Vehicle get(int Id);
	List<Vehicle> listVehicle();

}
