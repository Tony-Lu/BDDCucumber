$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/F:/Java/BDDCucumber/src/main/java/Features/login.feature");
formatter.feature({
  "name": "HRM Login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "HRM login test Scenartio",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is already on Login page",
  "keyword": "Given "
});
formatter.step({
  "name": "title of login page is OrangeHRM",
  "keyword": "When "
});
formatter.step({
  "name": "user enters \u0027\u003cusername\u003e\u0027 and \u0027\u003cpassword\u003e\u0027",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "name": "user is on the home page",
  "keyword": "Then "
});
formatter.step({
  "name": "browser closed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "admin123"
      ]
    },
    {
      "cells": [
        "Tom",
        "test123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "HRM login test Scenartio",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is already on Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of login page is OrangeHRM",
  "keyword": "When "
});
formatter.match({
  "location": "loginStepDefinition.title_of_login_is_OrangeHRM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \u0027admin\u0027 and \u0027admin123\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.user_enters_username_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "browser closed",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.browser_closed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "HRM login test Scenartio",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is already on Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of login page is OrangeHRM",
  "keyword": "When "
});
formatter.match({
  "location": "loginStepDefinition.title_of_login_is_OrangeHRM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \u0027Tom\u0027 and \u0027test123\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.user_enters_username_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "browser closed",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.browser_closed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});