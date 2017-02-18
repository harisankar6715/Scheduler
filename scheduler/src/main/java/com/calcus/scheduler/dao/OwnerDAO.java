package com.calcus.scheduler.dao;

import java.util.List;

import com.calcus.scheduler.model.Owner;


public interface OwnerDAO {
	
	void saveOrUpdate(Owner owner);
	void delete(int Id);
	public Owner get(int Id);
	List<Owner> listOwner();

}
