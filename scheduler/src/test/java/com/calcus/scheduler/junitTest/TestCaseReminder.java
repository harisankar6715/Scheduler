package com.calcus.scheduler.junitTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calcus.scheduler.dao.ReminderDAO;
import com.calcus.scheduler.model.Reminder;



public class TestCaseReminder {

	@Autowired
	static ReminderDAO reminderDAO;
	@Autowired
	static Reminder reminder;
	static AnnotationConfigApplicationContext context;
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.calcus");
		context.refresh();
		reminderDAO = (ReminderDAO) context.getBean("reminderDAO");
		reminder = (Reminder) context.getBean("reminder");
	}
	@Test
	public void reminderNameTest() {
		reminder = reminderDAO.get(1);
		String name = reminder.getExpiry_Date();
		System.out.println("******************----"+name);
		assertEquals("Reminder Name Test", "01072032", name);
	}

}
