package com.calcus.scheduler.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.calcus.scheduler.model.Permit;

@Transactional
@Repository("permitDAO") 
public class PermitDAOImpl implements PermitDAO{ 
	
	@Autowired
	SessionFactory sessionFactory;

	public PermitDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Permit permit) {
		sessionFactory.getCurrentSession().saveOrUpdate(permit);

	}

	@Transactional
	public void delete(int TId) {
		Permit permitToDelete = new Permit();
		permitToDelete.setTId(TId);
		sessionFactory.getCurrentSession().delete(permitToDelete);

	}

	@Transactional
	public Permit get(int TId) {
		String hql = "from Permit where Id=:TId";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("TId", TId);
		List<Permit> gotPermit = (List<Permit>)query.list();
		if (gotPermit != null && !gotPermit.isEmpty())
			return gotPermit.get(0);
		return null;
	}

	@Transactional
	public List<Permit> listPermit() {
		String hql = "from Permit";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Permit> listOfPermit = (List<Permit>)query.list();
		return listOfPermit;
	}

}
