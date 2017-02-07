package com.calcus.scheduler.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.calcus.scheduler.model.User;

@Transactional
@Repository("UserDAO") 
public class UserDAOImpl implements UserDAO{ 
	
	@Autowired
	SessionFactory sessionFactory;

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);

	}

	@Transactional
	public void delete(int Id) {
		User userToDelete = new User();
		userToDelete.setId(Id);
		sessionFactory.getCurrentSession().delete(userToDelete);

	}

	@Transactional
	public User getUser(int Id) {
		String hql = "from User where Id=:Id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("Id", Id);
		List<User> gotUser = (List<User>)query.list();
		if (gotUser != null && !gotUser.isEmpty())
			return gotUser.get(0);
		return null;
	}

	@Transactional
	public List<User> listUser() {
		String hql = "from User";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<User> listOfUser = (List<User>)query.list();
		return listOfUser;
	}

}
