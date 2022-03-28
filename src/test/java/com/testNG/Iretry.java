package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Iretry {
	
	@Test//(retryAnalyzer = Rerun.class)
	public void place() {

		String exp = "Porur";
		String act = "Porur";
		
		Assert.assertEquals(act, exp);
	}
	
	@Test//(retryAnalyzer = Rerun.class)
	public void pincode() {

		String exp = "600056";
		String act = "879456";
		
		Assert.assertEquals(act, exp);

	}

}
