package com.calcus.scheduler.junitTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calcus.scheduler.dao.PermitDAO;
import com.calcus.scheduler.model.Permit;


public class TestCasePermit {

	@Autowired
	static PermitDAO permitDAO;
	@Autowired
	static Permit permit;
	static AnnotationConfigApplicationContext context;
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.calcus");
		context.refresh();
		permitDAO = (PermitDAO) context.getBean("permitDAO");
		permit = (Permit) context.getBean("permit");
	}
	@Test
	public void permitNameTest() {
		permit = permitDAO.get(1);
		String name = permit.getExpiry_Date();
		System.out.println("******************----"+name);
		assertEquals("Permit Name Test", "01072022", name);
	}

}
