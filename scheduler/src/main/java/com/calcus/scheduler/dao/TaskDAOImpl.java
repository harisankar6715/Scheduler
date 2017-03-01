package com.calcus.scheduler.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.calcus.scheduler.model.Task;

@Repository("taskDAO")
public class TaskDAOImpl implements TaskDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	public TaskDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Task task) {
		Session s =sessionFactory.getCurrentSession();
		s.saveOrUpdate(task);
		s.flush();
	}
	@Transactional
	public void delete(int Task_Id) {
		Task taskTodelete = new Task();
		taskTodelete.setTask_Id(Task_Id);
		sessionFactory.getCurrentSession().delete(taskTodelete);
	}
	@Transactional
	public Task getTask(int Task_Id) {
		String hql = "from Task where Task_Id=:Task_Id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("Task_Id",
				Task_Id);
		List<Task> gotTask = (List<Task>)query.list();
		if (gotTask != null && !gotTask.isEmpty())
			return gotTask.get(0);
		return null;
	}
	@Transactional
	public List<Task> list() {
		String hql = "from Task";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Task> list = (List<Task>)query.list();
		return list;
	}

}
