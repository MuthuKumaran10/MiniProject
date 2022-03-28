package com.testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {
	
	@Test
	@Parameters({"username", "password"})
	public void credentials(@Optional("Muthu") String uname, String pass) {
		
		System.out.println("Username is :"+uname);
		System.out.println("Password is :"+pass);

	}

}
