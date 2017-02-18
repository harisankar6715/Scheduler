package com.calcus.scheduler.dao;

import java.util.List;

import com.calcus.scheduler.model.Insurance;



public interface InsuranceDAO {

	void saveOrUpdate(Insurance insurance);
	void delete(int Id);
	public Insurance get(int Id);
	List<Insurance> listInsurance();

}
