package com.sample.testng;

import org.testng.annotations.Test;

public class DependsOnMethods1 {
//	@Test (dependsOnMethods = "SearchProduct")
//	public void Cart() {
//		System.out.println("Save in cart");
//	}
	@Test (dependsOnMethods = "com.sample.testng.DependsOnMethods.SearchProduct")
	public void SearchProduct() {
		System.out.println("Select the product from the list");
	}
	@Test (dependsOnMethods = "com.sample.testng.DependsOnMethods.Buy")
	public void pay() {
		System.out.println("Go to the payment");
	}
	

}
