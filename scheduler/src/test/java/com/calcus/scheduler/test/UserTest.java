package com.calcus.scheduler.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calcus.scheduler.dao.UserDAO;
import com.calcus.scheduler.model.User;

public class UserTest {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.calcus");
		context.refresh();
		User user = (User) context.getBean("user");
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		
		
		user.setName("ASHISH");
		user.setPassword("ashish");
		user.setEmail("ashish@gmail.com");
		user.setMobile("9916903423");
		
		
		
		
		userDAO.saveOrUpdate(user);
		
		System.out.println("User Updated");
		}

}
