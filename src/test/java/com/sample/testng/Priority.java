package com.sample.testng;

import org.testng.annotations.Test;

public class Priority {
	@Test (priority = 1) 
	public void testThree() {
		System.out.println("Test 3");
	}
	@Test (priority = 2)
	public void testOne() {
		System.out.println("Test 1");
	}
	@Test
	public void testTwo() {
		System.out.println("Test 2");
	}
	@Test (priority = -1)
	public void testFive() {
		System.out.println("Test 5");
	}
	@Test (priority = -2)
	public void testFour() {
		System.out.println("Test 4");
	}

}
