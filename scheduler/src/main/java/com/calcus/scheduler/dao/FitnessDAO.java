package com.calcus.scheduler.dao;

import java.util.List;

import com.calcus.scheduler.model.Fitness;



public interface FitnessDAO { 
	
	void saveOrUpdate(Fitness fitness);
	void delete(int Id);
	public Fitness get(int Id);
	List<Fitness> listFitness();

}
