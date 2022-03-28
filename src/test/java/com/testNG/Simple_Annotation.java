package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	
	@BeforeSuite
	public void PropertySetup() {
		System.out.println("propertySetup");
	}
	
	@BeforeTest
	public void browserLaunch() {
		System.out.println("browserLaunch");
	}
	
	@BeforeClass
	public void urlLaunch() {
		System.out.println("urlLaunch");
	}
	
	@BeforeMethod
	public void sigin() {
		System.out.println("sigin");
	}
	
	@Test
	public void women() {
		System.out.println("women");
	}
	
	@Test
	public void men() {
		System.out.println("men");
	}
	
	@Test
	private void kids() {
		System.out.println("kids");
	}
	
	@AfterMethod
	public void singOut() {
		System.out.println("signOut");
	}
	
	@AfterClass
	public void sigIn_Page() {
		System.out.println("signIn Page");
	}
	
	@AfterTest
	public void homePage() {
		System.out.println("Home Page");
	}
	
	@AfterSuite
	public void quitBrowser() {
		System.out.println("Quit Browser");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
