package com.testNG;

import org.testng.annotations.Test;

public class Priority_Concept {
	
	@Test(priority = -1)
	public void women() {
		System.out.println("Women");
	}
	
	@Test(priority = 0, invocationCount = 5)
	public void men() {
		System.out.println("Men");
	}
	
	@Test
	public void kids() {
		System.out.println("kids");

	}

}
