package com.testNG;

import org.testng.annotations.Test;

public class ExpectedException_Concept {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void demo() {
		
		int a = 10;
		
		System.out.println(a/0);
	}
	

}
