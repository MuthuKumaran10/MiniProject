package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement first;
			
	@FindBy(id="last_name")
	private WebElement last;
			
	@FindBy(id="address")
	private WebElement address;
			
	@FindBy(id="cc_num")
	private WebElement cc;
			
	@FindBy(id="cc_type")
	private WebElement cctype;

	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
			
	@FindBy(id="cc_exp_year")
	private WebElement expyr;
			
	@FindBy(id="cc_cvv")
	private WebElement cvv;
			
	@FindBy(id="book_now")
	private WebElement book;

	public Book_Hotel(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc() {
		return cc;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyr() {
		return expyr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	


}
