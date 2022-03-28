package com.pojoclass;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	
	private Login_Page lp;
	
	private Search_Hotel sh;
	
	private Select_Hotel sel;
	
	private Book_Hotel bh;
	
	public PageObjectManager(WebDriver driver2) {
		
		this.driver=driver2;
		
	}

	public Login_Page getInstancelp() {
		
		lp= new Login_Page(driver);
		
		return lp;

	}
	
	public Search_Hotel getInstancesh() {
		
		sh = new Search_Hotel(driver);
		
		return sh;

	}

	public Select_Hotel getInstancesel() {
		
		sel = new Select_Hotel(driver);
		
		return sel;

	}
	
	public Book_Hotel getInstancebh() {
		
		bh = new Book_Hotel(driver);
		
		return bh;

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
