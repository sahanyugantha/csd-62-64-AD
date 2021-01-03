package com.sahan.csd62and64.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sahan.csd62and64.HealthServlet;

public class AnotherTest {
	
	//AAA
	
	int num1 = 50;
	int num2 = 150;
	int expected = 200;
	
	@Test
	public void testSum() {
		
		HealthServlet healthServlet = new HealthServlet();
		int actual = healthServlet.addTwoNumbers(num1, num2);
		 
		assertEquals(expected, actual); 
		
	}
	
	
}
