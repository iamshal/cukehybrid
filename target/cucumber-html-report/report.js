$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F01_LoginLogout.feature");
formatter.feature({
  "line": 1,
  "name": "Test the LoginLogout Feature of the application",
  "description": "",
  "id": "test-the-loginlogout-feature-of-the-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5405055094,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I am on the osCommerce homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "commonScenario.i_am_on_the_osCommerce_homepage()"
});
formatter.result({
  "duration": 13282726647,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Valid login logout scenario",
  "description": "",
  "id": "test-the-loginlogout-feature-of-the-application;valid-login-logout-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I click on the \"My Account\" link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I am logged in using valid username and valid password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on the Sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see \"Log Off\" link on page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I will click on the \"Log Off\" link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I will click on the \"Continue\" button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should see \"Welcome to 5ElementsLearning\" text on page.",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I should close the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 16
    }
  ],
  "location": "loginLogout.i_click_on_the_link(String)"
});
formatter.result({
  "duration": 3690375501,
  "status": "passed"
});
formatter.match({
  "location": "loginLogout.i_am_logged_in_using_valid_username_and_valid_password()"
});
formatter.result({
  "duration": 729356749,
  "status": "passed"
});
formatter.match({
  "location": "loginLogout.i_click_on_the_Sign_in_button()"
});
formatter.result({
  "duration": 1868541211,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Log Off",
      "offset": 14
    }
  ],
  "location": "loginLogout.i_should_see_link_on_page(String)"
});
formatter.result({
  "duration": 141064768,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Log Off",
      "offset": 21
    }
  ],
  "location": "loginLogout.i_will_click_on_the_link(String)"
});
formatter.result({
  "duration": 1059850234,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Continue",
      "offset": 21
    }
  ],
  "location": "loginLogout.i_will_click_on_the_button(String)"
});
formatter.result({
  "duration": 903150195,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome to 5ElementsLearning",
      "offset": 14
    }
  ],
  "location": "loginLogout.i_should_see_text_on_page(String)"
});
formatter.result({
  "duration": 62041927,
  "status": "passed"
});
formatter.match({
  "location": "commonScenario.i_should_close_the_browser()"
});
formatter.result({
  "duration": 756986448,
  "status": "passed"
});
formatter.after({
  "duration": 148423,
  "status": "passed"
});
formatter.before({
  "duration": 2414972460,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I am on the osCommerce homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "commonScenario.i_am_on_the_osCommerce_homepage()"
});
formatter.result({
  "duration": 4900118011,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Invalid login logout scenario",
  "description": "",
  "id": "test-the-loginlogout-feature-of-the-application;invalid-login-logout-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I click on the \"My Account\" link",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I am logged in using invalid username and invalid password",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I click on the Sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I should not see \"My Account Information\" on page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I should close the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 16
    }
  ],
  "location": "loginLogout.i_click_on_the_link(String)"
});
formatter.result({
  "duration": 1597817119,
  "status": "passed"
});
formatter.match({
  "location": "loginLogout.i_am_logged_in_using_invalid_username_and_invalid_password()"
});
formatter.result({
  "duration": 550934827,
  "status": "passed"
});
formatter.match({
  "location": "loginLogout.i_click_on_the_Sign_in_button()"
});
formatter.result({
  "duration": 1149521862,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Account Information",
      "offset": 18
    }
  ],
  "location": "loginLogout.i_should_not_see_on_page(String)"
});
formatter.result({
  "duration": 22790353,
  "status": "passed"
});
formatter.match({
  "location": "commonScenario.i_should_close_the_browser()"
});
formatter.result({
  "duration": 832147307,
  "status": "passed"
});
formatter.after({
  "duration": 34219,
  "status": "passed"
});
});