package com.calcus.scheduler.dao;

import java.util.List;

import com.calcus.scheduler.model.Vehicle;



public interface VehicleDAO {
	
	void saveOrUpdate(Vehicle vehicle);
	void delete(int VId);
	public Vehicle get(int VId);
	List<Vehicle> listVehicle();

}
