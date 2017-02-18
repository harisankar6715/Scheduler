package com.calcus.scheduler.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.calcus.scheduler.model.Pollution;


@Transactional
@Repository("pollutionDAO") 
public class PollutionDAOImpl implements PollutionDAO{ 
	
	@Autowired
	SessionFactory sessionFactory;

	public PollutionDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Pollution pollution) {
		sessionFactory.getCurrentSession().saveOrUpdate(pollution);

	}

	@Transactional
	public void delete(int PId) {
		Pollution pollutionToDelete = new Pollution();
		pollutionToDelete.setPId(PId);
		sessionFactory.getCurrentSession().delete(pollutionToDelete);

	}

	@Transactional
	public Pollution get(int PId) {
		String hql = "from Pollution where Id=:PId";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("PId", PId);
		List<Pollution> gotPollution = (List<Pollution>)query.list();
		if (gotPollution != null && !gotPollution.isEmpty())
			return gotPollution.get(0);
		return null;
	}

	@Transactional
	public List<Pollution> listPollution() {
		String hql = "from Pollution";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Pollution> listOfPollution = (List<Pollution>)query.list();
		return listOfPollution;
	}

}
