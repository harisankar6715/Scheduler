package com.calcus.scheduler.dao;

import java.util.List;

import com.calcus.scheduler.model.Permit;



public interface PermitDAO { 
	
	void saveOrUpdate(Permit permit);
	void delete(int Id);
	public Permit get(int Id);
	List<Permit> listPermit();

}
