package com.sample.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Enabled {
	@Test (enabled = false) 
	public void testThree() {
		System.out.println("Test 3");
	}
	@Ignore
	@Test 
	public void testOne() {
		System.out.println("Test 1");
	}
	@Test(enabled = false)
	public void testTwo() {
		System.out.println("Test 2");
	}
	@Test (enabled = true)
	public void testFive() {
		System.out.println("Test 5");
	}
	@Test (priority = -2)
	public void testFour() {
		System.out.println("Test 4");
	}

}
