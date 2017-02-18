package com.calcus.scheduler.junitTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calcus.scheduler.dao.OwnerDAO;
import com.calcus.scheduler.model.Owner;

public class TestCaseOwner {

	@Autowired
	static OwnerDAO ownerDAO;
	@Autowired
	static Owner owner;
	static AnnotationConfigApplicationContext context;
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.calcus");
		context.refresh();
		ownerDAO = (OwnerDAO) context.getBean("ownerDAO");
		owner = (Owner) context.getBean("owner");
	}
	@Test
	public void ownerNameTest() {
		owner = ownerDAO.get(1);
		String name = owner.getName();
		System.out.println("******************----"+name);
		assertEquals("Owner Name Test", "Owner", name);
	}

}
