package edu.iut.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iut.app.ApplicationInfoLog;

public class ApplicationInfoLogTest {

	@Test
	public void testSetMessage() {
		ApplicationInfoLog T = new ApplicationInfoLog();
		T.setMessage("test");
		T.toString();
	}

	@Test
	public void testApplicationInfoLog() {
		fail("Not yet implemented");
	}

	@Test
	public void testAbstractApplicationLog() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMessage() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetApplicationLogListeners() {
		fail("Not yet implemented");
	}

	@Test
	public void testFireMessage() {
		fail("Not yet implemented");
	}

}
