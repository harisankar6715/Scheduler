package com.calcus.scheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calcus.scheduler.dao.PermitDAO;
import com.calcus.scheduler.model.Permit;



public class PermitTest { 
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.calcus");
		context.refresh();
		PermitDAO permitDAO = (PermitDAO) context.getBean("permitDAO");
		Permit permit = (Permit) context.getBean("permit");
		// Create Operation
		permit.setTo_Date("02012017");
		permit.setExpiry_Date("01072022");
		permitDAO.saveOrUpdate(permit);
	    
	    System.out.println("Permit Updated");
		}

}
