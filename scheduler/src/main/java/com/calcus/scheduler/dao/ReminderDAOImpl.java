package com.calcus.scheduler.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.calcus.scheduler.model.Reminder;



@Transactional
@Repository("reminderDAO") 
public class ReminderDAOImpl implements ReminderDAO{ 
	
	@Autowired
	SessionFactory sessionFactory;

	public ReminderDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Reminder reminder) {
		sessionFactory.getCurrentSession().saveOrUpdate(reminder);

	}

	@Transactional
	public void delete(int Id) {
		Reminder reminderToDelete = new Reminder();
		reminderToDelete.setId(Id);
		sessionFactory.getCurrentSession().delete(reminderToDelete);

	}

	@Transactional
	public Reminder get(int Id) {
		String hql = "from Reminder where Id=:Id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("Id", Id);
		List<Reminder> gotReminder = (List<Reminder>)query.list();
		if (gotReminder != null && !gotReminder.isEmpty())
			return gotReminder.get(0);
		return null;
	}

	@Transactional
	public List<Reminder> listReminder() {
		String hql = "from Reminder";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Reminder> listOfReminder = (List<Reminder>)query.list();
		return listOfReminder;
	}

}
