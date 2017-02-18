package com.calcus.scheduler.dao;

import java.util.List;


import com.calcus.scheduler.model.RoadTax;

public interface RoadTaxDAO {
	
	void saveOrUpdate(RoadTax roadTax);
	void delete(int Id);
	public RoadTax get(int Id);
	List<RoadTax> listRoadTax();

}
