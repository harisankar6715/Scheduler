package com.calcus.scheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calcus.scheduler.dao.TaskDAO;
import com.calcus.scheduler.model.Task;

public class TaskTest { 
	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.calcus");
		context.refresh();
		TaskDAO taskDAO = (TaskDAO) context.getBean("taskDAO");
		Task task = (Task) context.getBean("task");
		
		// Create Operation
		
		task.setTitle("Deposite cash in bank");
		task.setDescription("To take 10000 rs from home and deposit at Andhra bank. A/C details XXXX IFSC : XXXXX");
		task.setStatus("Done");
		task.setUsers_Id("1");
		//task.setExpiry('20-09-2017');
	    taskDAO.saveOrUpdate(task);
		
	    
	    
			System.out.println("Task exist");
		
	}

}
