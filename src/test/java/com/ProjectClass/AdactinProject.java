package com.ProjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.Base_Class;
import com.pojoclass.Book_Hotel;
import com.pojoclass.Login_Page;
import com.pojoclass.PageObjectManager;
import com.pojoclass.Search_Hotel;
import com.pojoclass.Select_Hotel;

	public class AdactinProject extends Base_Class {
		
		public static WebDriver driver=Base_Class.browserLaunch("chrome");
	
		public static void main(String[] args) {
		
		launchUrl("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		PageObjectManager pom = new PageObjectManager(driver);
		
		passInput(pom.getInstancelp().getUser(),"Navinkaran");
		
		passInput(pom.getInstancelp().getPswd(), "Messi@@10");
		
		clickButton(pom.getInstancelp().getLogin());
		
		selectByValue(pom.getInstancesh().getLoc(), "Brisbane");
		
		selectByValue(pom.getInstancesh().getHot(), "Hotel Hervey");
		
		selectByValue(pom.getInstancesh().getRoom(), "Deluxe");
		
		selectByValue(pom.getInstancesh().getNos(), "1");
		
		passInput(pom.getInstancesh().getDatepick(), "26/02/2022");
		
		passInput(pom.getInstancesh().getDateout(), "27/02/2022");
		
		selectByValue(pom.getInstancesh().getAdult(), "2");
		
		selectByValue(pom.getInstancesh().getChild(), "0");
		
		clickButton(pom.getInstancesh().getSubmit());
		
		clickButton(pom.getInstancesel().getRadio());
		
		clickButton(pom.getInstancesel().getCont());
		
		passInput(pom.getInstancebh().getFirst(), "Muthu");
		
		passInput(pom.getInstancebh().getLast(), "Kumaran");
		
		passInput(pom.getInstancebh().getAddress(), "Chennai 600056");
		
		passInput(pom.getInstancebh().getCc(), "1234567895678979");
		
		selectByValue(pom.getInstancebh().getCctype(), "AMEX");

		selectByValue(pom.getInstancebh().getExpmonth(), "11");
		
		selectByValue(pom.getInstancebh().getExpyr(), "2022");
		
		passInput(pom.getInstancebh().getCvv(), "123");
		
		clickButton(pom.getInstancebh().getBook());
		
	}
}
