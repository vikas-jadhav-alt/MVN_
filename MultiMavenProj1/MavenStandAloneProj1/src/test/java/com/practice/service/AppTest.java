package com.practice.service;

import org.junit.Test;

import com.practice.service.App;

import junit.framework.TestCase;

public class AppTest extends TestCase {

	@Test
	public void shouldAnswerWithTrue() {
		System.out.println("Test With True");
		assertTrue(true);
	}

	@Test
	public void testAddWithPositives() {
		System.out.println("Test With Add");
		App app = new App();
		int actual = app.add(10, 20);
		int expected = 30;
		assertEquals(actual, expected);
	}
	
	@Test
	public void testAddWithNegatives() {
		App app = new App();
		int actual = app.add(-10, -20);
		int expected = -30;
		assertEquals(actual, expected);
	}
	
	@Test
	public void testAddWithZero() {
		App app = new App();
		int actual = app.add(0, 20);
		int expected = 20;
		assertEquals(actual, expected);
	}
	
	@Test
	public void testAddWithMixed() {
		App app = new App();
		int actual = app.add(-10, 70);
		int expected = 60;
		assertEquals(actual, expected);
	}
}
