package com.sahan.csd62and64.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sahan.csd62and64.SampleClass;

public class SampleTest {
	
	//Arrange
	int number = 4;
	int expected = 16;
	
	@Test
	public void sqTest() {
		//Act
		SampleClass sampleClass = new SampleClass();
		int actual = sampleClass.sqCal(number);
		
		//Assert
		assertEquals(expected, actual);
		
	}

}
