package com.calcus.scheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calcus.scheduler.dao.ReminderDAO;
import com.calcus.scheduler.model.Reminder;



public class ReminderTest {
	
public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.calcus");
		context.refresh();
		ReminderDAO reminderDAO = (ReminderDAO) context.getBean("reminderDAO");
		Reminder reminder = (Reminder) context.getBean("reminder");
		// Create Operation
		reminder.setTitle("Reminder");
		reminder.setDescription("This is the First Reminder");
		reminder.setDate("02012017");
		reminder.setExpiry_Date("01072032");
		reminderDAO.saveOrUpdate(reminder);
	    
	    System.out.println("Reminder Updated");
		}

}
