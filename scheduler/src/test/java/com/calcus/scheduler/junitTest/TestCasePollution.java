package com.calcus.scheduler.junitTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calcus.scheduler.dao.PollutionDAO;
import com.calcus.scheduler.model.Pollution;



public class TestCasePollution {

	@Autowired
	static PollutionDAO pollutionDAO;
	@Autowired
	static Pollution pollution;
	static AnnotationConfigApplicationContext context;
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.calcus");
		context.refresh();
		pollutionDAO = (PollutionDAO) context.getBean("pollutionDAO");
		pollution = (Pollution) context.getBean("pollution");
	}
	@Test
	public void pollutionNameTest() {
		pollution = pollutionDAO.get(1);
		String name = pollution.getExpiry_Date();
		System.out.println("******************----"+name);
		assertEquals("Pollution Name Test", "01072017", name);
	}

}
