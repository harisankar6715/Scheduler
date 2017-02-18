package com.calcus.scheduler.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.calcus.scheduler.model.Fitness;



@Transactional
@Repository("fitnessDAO") 
public class FitnessDAOImpl implements FitnessDAO{ 
	
	@Autowired
	SessionFactory sessionFactory;

	public FitnessDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Fitness fitness) {
		sessionFactory.getCurrentSession().saveOrUpdate(fitness);

	}

	@Transactional
	public void delete(int Id) {
		Fitness fitnessToDelete = new Fitness();
		fitnessToDelete.setId(Id);
		sessionFactory.getCurrentSession().delete(fitnessToDelete);

	}

	@Transactional
	public Fitness get(int Id) {
		String hql = "from Fitness where Id=:Id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("Id", Id);
		List<Fitness> gotFitness = (List<Fitness>)query.list();
		if (gotFitness != null && !gotFitness.isEmpty())
			return gotFitness.get(0);
		return null;
	}

	@Transactional
	public List<Fitness> listFitness() {
		String hql = "from Fitness";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Fitness> listOfFitness = (List<Fitness>)query.list();
		return listOfFitness;
	}

}
