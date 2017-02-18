package com.calcus.scheduler.dao;

import java.util.List;


import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.calcus.scheduler.model.Owner;


@Transactional
@Repository("ownerDAO") 
public class OwnerDAOImpl implements OwnerDAO{

	@Autowired
	SessionFactory sessionFactory;

	public OwnerDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Owner owner) {
		sessionFactory.getCurrentSession().saveOrUpdate(owner);

	}

	@Transactional
	public void delete(int Id) {
		Owner ownerToDelete = new Owner();
		ownerToDelete.setId(Id);
		sessionFactory.getCurrentSession().delete(ownerToDelete);

	}

	@Transactional
	public Owner get(int Id) {
		String hql = "from Owner where Id=:Id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("Id", Id);
		List<Owner> gotOwner = (List<Owner>)query.list();
		if (gotOwner != null && !gotOwner.isEmpty())
			return gotOwner.get(0);
		return null;
	}

	@Transactional
	public List<Owner> listOwner() {
		String hql = "from Owner";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Owner> listOfOwner = (List<Owner>)query.list();
		return listOfOwner;
	}
}
