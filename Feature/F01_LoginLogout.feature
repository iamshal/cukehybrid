Feature: Test the LoginLogout Feature of the application
	Background:
		Given I am on the osCommerce homepage
	Scenario: Valid login logout scenario
		When I click on the "My Account" link
		When I am logged in using valid username and valid password
		When I click on the Sign in button
		Then I should see "Log Off" link on page
		When I will click on the "Log Off" link
		When I will click on the "Continue" button
		Then I should see "Welcome to 5ElementsLearning" text on page. 
		Then I should close the browser
	
	Scenario: Invalid login logout scenario
		When I click on the "My Account" link
		When I am logged in using invalid username and invalid password
		When I click on the Sign in button
		Then I should not see "My Account Information" on page 
		Then I should close the browser

 