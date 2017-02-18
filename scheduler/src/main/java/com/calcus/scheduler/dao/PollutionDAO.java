package com.calcus.scheduler.dao;

import java.util.List;

import com.calcus.scheduler.model.Pollution;



public interface PollutionDAO {
	
	void saveOrUpdate(Pollution pollution);
	void delete(int Id);
	public Pollution get(int Id);
	List<Pollution> listPollution();

}
