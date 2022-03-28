
package com.testNG;

import org.testng.annotations.Test;

public class Grouping_Concept {
	
	@Test(groups = "Vegetables")
	public void carrot() {
		System.out.println("Carrot");	
	}
	
	@Test(groups = "Vegetables")
	public void tomato() {
		System.out.println("Tomato");
	}
	
	@Test(groups = "Vegetables")
	public void onion() {
		System.out.println("Onion");
	}
	
	@Test(groups = "Fruits")
	public void apple() {
		System.out.println("Apple");
	}
	
	@Test(groups = "Fruits")
	public void mango() {
		System.out.println("mango");
	}
	
	@Test(groups = "Vehicles")
	public void car() {
		System.out.println("Car");
	}
	
	@Test(groups = "Vehicles")
	public void bike() {
		System.out.println("Bike");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
