package com.calcus.scheduler.junitTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calcus.scheduler.dao.RoadTaxDAO;
import com.calcus.scheduler.model.RoadTax;



public class TestCaseRoadTax {

	@Autowired
	static RoadTaxDAO roadTaxDAO;
	@Autowired
	static RoadTax roadTax;
	static AnnotationConfigApplicationContext context;
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.calcus");
		context.refresh();
		roadTaxDAO = (RoadTaxDAO) context.getBean("roadTaxDAO");
		roadTax = (RoadTax) context.getBean("roadTax");
	}
	@Test
	public void roadTaxNameTest() {
		roadTax = roadTaxDAO.get(1);
		String name = roadTax.getExpiry_Date();
		System.out.println("******************----"+name);
		assertEquals("RoadTax Name Test", "01012032", name);
	}

}
