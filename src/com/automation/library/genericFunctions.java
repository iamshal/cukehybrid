package com.automation.library;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.PageFactory;

import com.pageobject.models.*;

public class genericFunctions {

		public static WebDriver driver = null;
		public static String baseURL="http://www.5elementslearning.com/demosite";
	
		public static WebDriver setDriver() throws Exception{
			System.setProperty("webdriver.chrome.driver","D:\\BUSINESS\\5 ELEMENTS LEARNING\\SELENIUM WEBDRIVER\\DRIVER\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			return driver;
	}
	
		public static void CloseBrowser() throws Exception{
			driver.quit();
		}
	
		public static boolean isElementPresent(By by) {
			boolean isPresent = true;
			try{
				driver.findElement(by);
			 }catch (NoSuchElementException e) {
				 isPresent = false;
				 }
			return isPresent;
			}
		
		public static boolean isTextPresent(String txtOnScreen){
			if(driver.getPageSource().contains(txtOnScreen)){
		    	return true;
		    }else{
		    	return false;
		}
	}
		
		
}
