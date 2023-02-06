package com.sample.testng;

import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test 
	public void URLLaunch() {
		System.out.println("Launch the URL");
	}
	@Test (dependsOnMethods = "SearchProduct")
	public void SaveToCart() {
		System.out.println("Add the item to the cart");
	}
	@Test (dependsOnMethods = "URLLaunch")
	public void Login()  {
		System.out.println("Login to the page");
	}
	@Test (dependsOnMethods = "SaveToCart")
	public void Buy() {
		System.out.println("Proceed to Buy");
	}
	
	@Test(dependsOnMethods = "Login")
	public void SearchProuduct() {
		System.out.println("Search the product");
	}

}
