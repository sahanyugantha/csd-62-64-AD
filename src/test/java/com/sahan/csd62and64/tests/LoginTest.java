package com.sahan.csd62and64.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sahan.csd62and64.SigninServlet;

public class LoginTest {
	
	int expected = 1;
	String email = "sahan@bcas.lk";
	String pass = "123";
	
	@Test
	public void testLogin() {
		
		SigninServlet signinServlet = new SigninServlet();
		int actual = signinServlet.loginChecker(email, pass);
		
		assertEquals(expected, actual);
		
	}

}
