package com.calcus.scheduler.junitTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calcus.scheduler.dao.TaskDAO;
import com.calcus.scheduler.model.Task;

public class TestCaseTask {

	@Autowired
	static TaskDAO taskDAO;
	@Autowired
	static Task task;
	static AnnotationConfigApplicationContext context;
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.calcus");
		context.refresh();
		taskDAO = (TaskDAO) context.getBean("taskDAO");
		task = (Task) context.getBean("task");
	}
	@Test
	public void taskNameTest() {
		task = taskDAO.getTask(1);
		String name = task.getTitle();
		System.out.println("******************----"+name);
		assertEquals("Task Name Test", "Deposite cash in bank", name);
	}

}
