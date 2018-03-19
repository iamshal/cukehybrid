package com.pageobject.models;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogoutPage {
	
	
	@FindBy(how=How.LINK_TEXT, using="Log Off")
	public static WebElement logoff_link;
	
	
	@FindBy(how=How.LINK_TEXT, using="Continue")
	public static WebElement ctn_link;

	
}
