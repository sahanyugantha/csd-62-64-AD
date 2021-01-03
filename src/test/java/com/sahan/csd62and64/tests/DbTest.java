package com.sahan.csd62and64.tests;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import com.sahan.csd62and64.config.DbConnection;

public class DbTest {
	
	private Connection unexpected = null;
	
	@Test
	public void testDb() throws ClassNotFoundException {
		Connection actual = DbConnection.getConnection();
		
		assertNotEquals(unexpected, actual);
	}

}
