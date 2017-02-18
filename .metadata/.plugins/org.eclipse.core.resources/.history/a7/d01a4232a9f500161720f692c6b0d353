package com.calcus.scheduler.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.calcus.scheduler.model.Vehicle;



@Transactional
@Repository("vehicleDAO") 
public class VehicleDAOImpl implements VehicleDAO { 
	
	@Autowired
	SessionFactory sessionFactory;

	public VehicleDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Vehicle vehicle) {
		sessionFactory.getCurrentSession().saveOrUpdate(vehicle);

	}

	@Transactional
	public void delete(int VId) {
		Vehicle vehicleToDelete = new Vehicle();
		vehicleToDelete.setVId(VId);
		sessionFactory.getCurrentSession().delete(vehicleToDelete);

	}

	@Transactional
	public Vehicle get(int VId) {
		String hql = "from Vehicle where Id=:VId";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("VId", VId);
		List<Vehicle> gotVehicle = (List<Vehicle>)query.list();
		if (gotVehicle != null && !gotVehicle.isEmpty())
			return gotVehicle.get(0);
		return null;
	}

	@Transactional
	public List<Vehicle> listVehicle() {
		String hql = "from Vehicle";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Vehicle> listOfVehicle = (List<Vehicle>)query.list();
		return listOfVehicle;
	}

}
