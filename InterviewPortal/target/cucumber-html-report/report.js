$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "SauceDemo login feature",
  "description": "",
  "id": "saucedemo-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login with valid credentials",
  "description": "",
  "id": "saucedemo-login-feature;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters valid username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters valid password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageMethods.user_is_on_login_page()"
});
formatter.result({
  "duration": 5658687500,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageMethods.user_enters_valid_username()"
});
formatter.result({
  "duration": 157423000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageMethods.user_enters_valid_password()"
});
formatter.result({
  "duration": 190292900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageMethods.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 287206000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageMethods.user_closes_the_browser()"
});
formatter.result({
  "duration": 744580300,
  "status": "passed"
});
});