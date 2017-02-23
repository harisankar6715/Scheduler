package com.calcus.scheduler.dao;

import java.util.List;

import com.calcus.scheduler.model.Reminder;


public interface ReminderDAO {
	
	void saveOrUpdate(Reminder reminder);
	void delete(int Id);
	public Reminder get(int Id);
	List<Reminder> listReminder();

}
