package com.testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Concept {
	
	@Test
	public void empId() {

		String ext_empId = "Emp123";
		
		String act_empId = "ep233";
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertNotEquals(ext_empId, act_empId);
	}

}
