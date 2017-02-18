package com.calcus.scheduler.junitTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calcus.scheduler.dao.VehicleDAO;
import com.calcus.scheduler.model.Vehicle;



public class TestCaseVehicle {

	@Autowired
	static VehicleDAO vehicleDAO;
	@Autowired
	static Vehicle vehicle;
	static AnnotationConfigApplicationContext context;
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.calcus");
		context.refresh();
		vehicleDAO = (VehicleDAO) context.getBean("vehicleDAO");
		vehicle = (Vehicle) context.getBean("vehicle");
	}
	@Test
	public void vehicleNameTest() {
		vehicle = vehicleDAO.get(1);
		String name = vehicle.getReg_No();
		System.out.println("******************----"+name);
		assertEquals("Vehicle Name Test", "KL08BG1234", name);
	}

}
