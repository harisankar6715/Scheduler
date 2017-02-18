package com.calcus.scheduler.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.calcus.scheduler.model.RoadTax;

@Transactional
@Repository("roadTaxDAO") 
public class RoadTaxDAOImpl implements RoadTaxDAO{ 
	
	@Autowired
	SessionFactory sessionFactory;

	public RoadTaxDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(RoadTax roadTax) {
		sessionFactory.getCurrentSession().saveOrUpdate(roadTax);

	}

	@Transactional
	public void delete(int Id) {
		RoadTax roadTaxToDelete = new RoadTax();
		roadTaxToDelete.setId(Id);
		sessionFactory.getCurrentSession().delete(roadTaxToDelete);

	}

	@Transactional
	public RoadTax get(int Id) {
		String hql = "from RoadTax where Id=:Id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("Id", Id);
		List<RoadTax> gotRoadTax = (List<RoadTax>)query.list();
		if (gotRoadTax != null && !gotRoadTax.isEmpty())
			return gotRoadTax.get(0);
		return null;
	}

	@Transactional
	public List<RoadTax> listRoadTax() {
		String hql = "from RoadTax";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<RoadTax> listOfRoadTax = (List<RoadTax>)query.list();
		return listOfRoadTax;
	}

}
