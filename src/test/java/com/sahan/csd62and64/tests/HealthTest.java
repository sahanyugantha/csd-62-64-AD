package com.sahan.csd62and64.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sahan.csd62and64.HealthServlet;

public class HealthTest {
	
	
	//Arrange
	String weight = "60";
	String height = "164";
	double expected = 22.31;
	
	@Test
	public void bmiTest() {
		//Act
		HealthServlet healthServlet = new HealthServlet();
		double actual = healthServlet.calculateBmi(weight, height);
		
		//Assert
		assertEquals(expected, actual);
		
	}
	
	

}
