package com.testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
	@Test
	public void carrot() {
		System.out.println("Carrot");
	}
	
	@Test(enabled = false)
	public void tomato() {
		System.out.println("Tomato");
	}
	
	@Ignore
	@Test
	public void onion() {
		System.out.println("Onion");
	}
	
	@Test
	public void apple() {
		System.out.println("Apple");
	}
	
	@Test
	public void mango() {
		System.out.println("Mango");
	}
	
	
}
