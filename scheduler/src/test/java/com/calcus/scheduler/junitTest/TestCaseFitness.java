package com.calcus.scheduler.junitTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calcus.scheduler.dao.FitnessDAO;
import com.calcus.scheduler.model.Fitness;



public class TestCaseFitness {

	@Autowired
	static FitnessDAO fitnessDAO;
	@Autowired
	static Fitness fitness;
	static AnnotationConfigApplicationContext context;
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.calcus");
		context.refresh();
		fitnessDAO = (FitnessDAO) context.getBean("fitnessDAO");
		fitness = (Fitness) context.getBean("fitness");
	}
	@Test
	public void fitnessNameTest() {
		fitness = fitnessDAO.get(1);
		String name = fitness.getExpiry_Date();
		System.out.println("******************----"+name);
		assertEquals("Fitness Name Test", "01072032", name);
	}

}
