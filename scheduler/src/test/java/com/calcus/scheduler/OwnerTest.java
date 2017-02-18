package com.calcus.scheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calcus.scheduler.dao.OwnerDAO;
import com.calcus.scheduler.model.Owner;



public class OwnerTest { 
	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.calcus");
		context.refresh();
		OwnerDAO ownerDAO = (OwnerDAO) context.getBean("ownerDAO");
		Owner owner = (Owner) context.getBean("owner");
		// Create Operation
		owner.setName("Owner");
		owner.setEmail("owner@gamil.com");
		owner.setMobile("8593800002");
		ownerDAO.saveOrUpdate(owner);
	 
		System.out.println("Owner Updated");
	}

}
