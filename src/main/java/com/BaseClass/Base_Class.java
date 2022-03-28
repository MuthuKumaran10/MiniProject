package com.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver; // Null Value
	
// Browser Launch
	
	public static WebDriver browserLaunch(String name) {
		
		if (name.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		
		else if (name.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir") + "\\Driver\\gecodriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		return driver;
	}
		
//get
	
	public static void launchUrl(String url) {
		driver.get(url);
		
	}
	
//close	
	
	public static void closeTheBrowser() {
		driver.close();
	
	}
	
//Quit
	
	public static void quitTheBrowser() {
		driver.quit();

	}
	
//sendkeys
	
	public static void passInput(WebElement element, String Input) {
		element.sendKeys(Input);
	
	}
	
//click	
	
	public static void clickButton(WebElement element) {
		element.click();
    
	}
	
//clear
	
	public static void clear(WebElement element) {
		element.clear();

	}
	
//getText
	
		public static void getText(String text) {
			text = driver.switchTo().alert().getText();
			System.out.println(text);
			
		}
		
//getAttribute
		
		public static void getAttribute(WebElement element, String value) {
			String attribute = element.getAttribute(value);
			System.out.println(attribute);

		}
		
//getTitle
		
		public static void getTitle() {
			String title = driver.getTitle();
			System.out.println(title);

		}
	
//getCurrentUrl
		
		public static void getCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);

		}	
		
//navigateTo
	
	public static void navigateTo(String url) {
		driver.navigate().to(url);

	}
	
//navigateBack	
	
	public static void navigateBack() {
		driver.navigate().back();
	
	}
	
//navigateForward

	public static void navigateForward() { 
		driver.navigate().forward();

	}
	
//navigateRefresh

	public static void navigateRefresh() {
		driver. navigate().refresh();	
		
	}
	
//clickOk
	
	public static void clickOk() {
		driver.switchTo().alert().accept();

	}
	
//cancel
	
	public static void cancel() {
		driver.switchTo().alert().dismiss();

	}
	
//alertSendKeys
	
	public static void alertSendKeys(String input) {
		driver.switchTo().alert().sendKeys(input);

	}
	
//actionClick
	
	public static void actionClick(WebElement element) {
		Actions ac1 = new Actions(driver);
		ac1.click(element);

	}
	
//actionContextClick
	
	public static void actionContextClick(WebElement element) {
		Actions ac2 = new Actions(driver);
		ac2.contextClick(element).build().perform();

	}
	
//actionDoubleClick
	
	public static void actionDoubleClick(WebElement element) {
		Actions ac3 = new Actions(driver);
		ac3.doubleClick(element).build().perform();

	}
	
//moveToElement
	
	public static void moveToElement(WebElement element) {
		Actions ac4 = new Actions(driver);
		ac4.doubleClick(element).build().perform();

	}
	
//dragAndDrop
	
	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions ac5 = new Actions(driver);
		ac5.dragAndDrop(source, target).build().perform();

	}
	
//keyboardActions
	
	public static void keyboardActions(int arg1, int arg2) throws AWTException {
		Robot r = new Robot();
		r.keyPress(arg1);
		r.keyRelease(arg2);
	}
	
//frameIndex	
	
	public static void frameIndex(int i) {
		driver.switchTo().frame(i);

	}
	
//frameID	
	
	public static void frameID(String nameOrID) {
		driver.switchTo().frame(nameOrID);

	}
	
//frameElement
	
	public static void frameElement(WebElement element) {
		driver.switchTo().frame(element);

	}
	
//windowHandle
	
	public static void windowHandle() {
		String s = driver.getWindowHandle();
		driver.switchTo().window(s).getTitle();

	}
	
//windowHandles
	
	public static void windowHandles() {
		Set<String> all = driver.getWindowHandles();
		for (String st : all) {
			System.out.println(st);
			String title = driver.switchTo().window(st).getTitle();
			System.out.println(title);
			
		}
	}

//checkDisplayed
		
		public static void checkDisplayed(WebElement element) {
			boolean d = element.isDisplayed();
			System.out.println(d);
		
			}
	
//checkEnabled
		
		public static void checkEnabled(WebElement element) {
			boolean e = element.isEnabled();
			System.out.println(e);

		}
	
//checkSelected
		
		public static void checkSelected(WebElement element) {
			boolean s = element.isSelected();
			System.out.println(s);

		}
	
//scroll
		
		public static void scrollFunction(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
			
		}
	
//dropdown.SelectbyValue
		
		public static void selectByValue(WebElement element, String value) {
			Select s = new Select(element);
			s.selectByValue(value);

		}
	
//dropdown.selectByIndex
		
		public static void selectByIndex(WebElement element, int index) {
			Select s = new Select(element);
			s.selectByIndex(index);

		}
	
//dropdown-selectByVisibleText
		
		public static void selectByVisibleText(WebElement element, String text) {
			Select s = new Select(element);
			s.selectByVisibleText(text);

		}
	
//dropdown-deselectByIndex
		
		public static void deselectByIndex(WebElement element, int index) {
			Select s1 = new Select(element);
			s1.deselectByIndex(index);

		}
	
//dropdown-deselectByVisibleText
		
		public static void deselectByVisibleText(WebElement element, String text) {
			Select s1 = new Select(element);
			s1.deselectByVisibleText(text);

		}
	
//isMultiple
		
		public static  void isMultiple(WebElement element) {
			Select s = new Select(element);
			boolean m = s.isMultiple();
			System.out.println(m);

		}
	
//getOptions
		
		public static void getOptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> options = s.getOptions();
			for (WebElement opt : options) {
				String text = opt.getText();
				System.out.println(text);
				
			}
		}
	
//allSelectedOptions
		
		public static void allSelectedOptions(WebElement element, String text) {
			Select s = new Select(element);
			System.out.println(text);
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement selected : allSelectedOptions) {
				String text2 = selected.getText();
				System.out.println(text2);
				
			}
		}
	
//firstSelectedOption
		
		public static void firstSelectedOptions(WebElement element, String text) {
			Select s = new Select(element);
			System.out.println(text);
			WebElement fso = s.getFirstSelectedOption();
			String text2 = fso.getText();
			System.out.println(text2);
	
		}
	
//deselectAll
		
		public static void deselectAll(WebElement element) {
			Select s = new Select(element);
			s.deselectAll();

		}
	
//screenshot
		
		public static void screenshot(String path) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File sou = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(path);
			FileUtils.copyFile(sou, des);
		}
	
//implicitWait
		
			public static void implicitlyWait(int seconds) {
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

				}	

}
