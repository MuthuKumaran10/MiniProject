package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Concept {
	
	@Test
	public void empName() {
		
		String ext_empName = "Navinmessi";
		
		String act_empName = "NavinMessi";
		
		Assert.assertNotEquals(ext_empName, act_empName);
		
		System.out.println("Validation");

	}

}
