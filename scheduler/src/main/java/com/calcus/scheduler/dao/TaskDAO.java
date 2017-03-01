package com.calcus.scheduler.dao;

import java.util.List;

import com.calcus.scheduler.model.Task;

public interface TaskDAO { 
	
	public List<Task> list();
	public Task getTask(int Task_id);
	public void saveOrUpdate(Task task);
	public void delete(int Task_id);


}
