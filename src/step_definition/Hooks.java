package step_definition;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;

import com.automation.library.genericFunctions;
import com.pageobject.models.LoginPage;
import com.pageobject.models.LogoutPage;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
    
	WebDriver driver;
	
	@Before
    public void logInfo(Scenario scenario) throws Exception {
    	driver=genericFunctions.setDriver();
		PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, LogoutPage.class);
}
    
    @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void embedScreenshot(Scenario scenario) {
        if(scenario.isFailed()) {
        try {
        	 scenario.write("Current Page URL is " + driver.getCurrentUrl());
        	 byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        	 scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        }
        driver.quit(); //Close in case of Error
    }
}