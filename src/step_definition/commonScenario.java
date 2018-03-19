package step_definition;

import com.automation.library.genericFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class commonScenario {
	
	@Given("^I am on the osCommerce homepage$")
	public void i_am_on_the_osCommerce_homepage() throws Throwable {
			genericFunctions.driver.get(genericFunctions.baseURL);
		}
	
	@Then("^I should close the browser$")
	public void i_should_close_the_browser() throws Throwable {
			genericFunctions.CloseBrowser();
	}
}