$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/ramco/features/Login.feature");
formatter.feature({
  "name": "Application Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "HomePage Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mobTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "users should be at login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.ramco.stepdefinition.StepDefinition.users_should_be_at_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login with username \"chetan\" and password \"lal\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.ramco.stepdefinition.StepDefinition.user_login_with_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "home page is populated",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ramco.stepdefinition.StepDefinition.home_page_is_populated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "All cards are displayed",
  "keyword": "And "
});
formatter.match({
  "location": "com.ramco.stepdefinition.StepDefinition.all_cards_are_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});