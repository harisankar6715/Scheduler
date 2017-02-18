package com.calcus.scheduler.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.calcus.scheduler.model.Insurance;



@Transactional
@Repository("insuranceDAO") 
public class InsuranceDAOImpl implements InsuranceDAO{ 
	
	@Autowired
	SessionFactory sessionFactory;

	public InsuranceDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Insurance insurance) {
		sessionFactory.getCurrentSession().saveOrUpdate(insurance);

	}

	@Transactional
	public void delete(int IId) {
		Insurance insuranceToDelete = new Insurance();
		insuranceToDelete.setIId(IId);
		sessionFactory.getCurrentSession().delete(insuranceToDelete);

	}

	@Transactional
	public Insurance get(int IId) {
		String hql = "from Insurance where Id=:IId";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("IId", IId);
		List<Insurance> gotInsurance = (List<Insurance>)query.list();
		if (gotInsurance != null && !gotInsurance.isEmpty())
			return gotInsurance.get(0);
		return null;
	}

	@Transactional
	public List<Insurance> listInsurance() {
		String hql = "from Insurance";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Insurance> listOfInsurance = (List<Insurance>)query.list();
		return listOfInsurance;
	}


}
