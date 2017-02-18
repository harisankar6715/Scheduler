package com.calcus.scheduler.junitTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calcus.scheduler.dao.InsuranceDAO;
import com.calcus.scheduler.model.Insurance;



public class TestCaseInsurance {

	@Autowired
	static InsuranceDAO insuranceDAO;
	@Autowired
	static Insurance insurance;
	static AnnotationConfigApplicationContext context;
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.calcus");
		context.refresh();
		insuranceDAO = (InsuranceDAO) context.getBean("insuranceDAO");
		insurance = (Insurance) context.getBean("insurance");
	}
	@Test
	public void insuranceNameTest() {
		insurance = insuranceDAO.get(1);
		String name = insurance.getExpiry_Date();
		System.out.println("******************----"+name);
		assertEquals("Insurance Name Test", "01012018", name);
	}

}
