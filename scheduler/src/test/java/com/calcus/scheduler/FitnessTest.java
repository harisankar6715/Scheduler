package com.calcus.scheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calcus.scheduler.dao.FitnessDAO;
import com.calcus.scheduler.model.Fitness;



public class FitnessTest { 
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.calcus");
		context.refresh();
		FitnessDAO fitnessDAO = (FitnessDAO) context.getBean("fitnessDAO");
		Fitness fitness = (Fitness) context.getBean("fitness");
		// Create Operation
		fitness.setTo_Date("02012017");
		fitness.setExpiry_Date("01072032");
		fitnessDAO.saveOrUpdate(fitness);
	    
	    System.out.println("Fitness Updated");
		}

}
