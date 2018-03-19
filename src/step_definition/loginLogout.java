package step_definition;

import java.util.HashMap;
import java.util.List;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import com.automation.library.*;
import com.pageobject.models.*;

public class loginLogout {
	
	  public List<HashMap<String,String>> datamap;
	     
	    public loginLogout(){
	    	datamap = DataHelper.data();
	     }
	 
    @When("^I click on the \"([^\"]*)\" link$")
	public void i_click_on_the_link(String myAcclink) throws Throwable {
		LoginPage.myaccnt_link.click();
	}
	
    //Scenario for the Valid user data - ROW 1
    @When("^I am logged in using valid username and valid password$")
    public void i_am_logged_in_using_valid_username_and_valid_password() throws Throwable {
    	LoginPage.username_txtbx.sendKeys(datamap.get(0).get("username"));
		LoginPage.passwd_txtbx.sendKeys(datamap.get(0).get("password"));
		
	}
    
  //Scenario for the In Valid user data - ROW 2
    @When("^I am logged in using invalid username and invalid password$")
    public void i_am_logged_in_using_invalid_username_and_invalid_password() throws Throwable {
    	LoginPage.username_txtbx.sendKeys(datamap.get(1).get("username"));
   		LoginPage.passwd_txtbx.sendKeys(datamap.get(1).get("password"));
   		
   	}
	
	@When("^I click on the Sign in button$")
	public void i_click_on_the_Sign_in_button() throws Throwable {
		LoginPage.signin_btn.click();
	}
	
	@Then("^I should see \"([^\"]*)\" link on page$")
	public void i_should_see_link_on_page(String logOfflink) throws Throwable {
	    
		if(LogoutPage.logoff_link.isDisplayed()){
	    	assertTrue("Login Pass",true);
	    }else{
	    	fail("Login Fail");
	    }
	}
	
	@When("^I will click on the \"([^\"]*)\" link$")
	public void i_will_click_on_the_link(String logoffLink) throws Throwable {
	   LogoutPage.logoff_link.click();
	}
	
	@When("^I will click on the \"([^\"]*)\" button$")
	public void i_will_click_on_the_button(String contBtn) throws Throwable {
		 LogoutPage.ctn_link.click();
	}
	
	@Then("^I should see \"([^\"]*)\" text on page\\.$")
	public void i_should_see_text_on_page(String arg1) throws Throwable {
	    if(genericFunctions.isTextPresent(arg1)){
	    	assertTrue("Login Pass",true);
	    }else{
	    		fail("Login unsuccessful");
	    	}
	    }
	    
	@Then("^I should not see \"([^\"]*)\" on page$")
	public void i_should_not_see_on_page(String arg1) throws Throwable {
		if(genericFunctions.isTextPresent(arg1)){
			fail("Scenario for bad login failed");
	    }else{
	    	assertTrue("Scenario for bad login is pass", true);
	    }
	    
	}
	

}
