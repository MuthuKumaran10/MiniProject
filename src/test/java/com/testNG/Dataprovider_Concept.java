package com.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Concept {
	
	@Test(dataProvider = "feedData")
	public void flipkart(String phone, String password) {
		System.out.println("Phone no is :"+phone);
		System.out.println("Password is :"+password);
		
	}
		
		@Test(dataProvider = "addData")
		public void amazon(String phone, String password) {
			System.out.println("Phone no is :"+phone);
			System.out.println("Password is :"+password);

	}
	
	@DataProvider
	public Object[][] feedData() {
		
		return new Object[][] {
			
			{"123456789" , "GoFlipkart123"},
			{"987654321", "Letsgo123"}
		};

	}
	
	@DataProvider
	public Object[][] addData() {
		
		return new Object[][] {
			
			{"917917917" , "amaze1230"},
			{"8178171817" , "123amaze"}
		};

	}

}
