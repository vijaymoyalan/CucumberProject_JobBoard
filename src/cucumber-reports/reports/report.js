$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Job Board_Activity1.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Vijay Moyalan"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Visit the site�s backend and create a new user"
    }
  ],
  "line": 7,
  "name": "Create a new user for Job-board system.",
  "description": "Visit the site�s backend and create a new user",
  "id": "create-a-new-user-for-job-board-system.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 6,
      "name": "@JBactivity1"
    }
  ]
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Visit the site backend and create a new user",
  "description": "",
  "id": "create-a-new-user-for-job-board-system.;visit-the-site-backend-and-create-a-new-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Open wp admin URL",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User enter \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Click on menu item Users",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Click on Add New button fill details and click on new button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Verify the user creation",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "create-a-new-user-for-job-board-system.;visit-the-site-backend-and-create-a-new-user;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 20,
      "id": "create-a-new-user-for-job-board-system.;visit-the-site-backend-and-create-a-new-user;;1"
    },
    {
      "cells": [
        "root",
        "pa$$w0rd"
      ],
      "line": 21,
      "id": "create-a-new-user-for-job-board-system.;visit-the-site-backend-and-create-a-new-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Visit the site backend and create a new user",
  "description": "",
  "id": "create-a-new-user-for-job-board-system.;visit-the-site-backend-and-create-a-new-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@tag1"
    },
    {
      "line": 6,
      "name": "@JBactivity1"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Open wp admin URL",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User enter \"root\" and \"pa$$w0rd\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Click on menu item Users",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Click on Add New button fill details and click on new button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Verify the user creation",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "JobBoardActivity1.givenFunctionName()"
});
formatter.result({
  "duration": 9713956000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "root",
      "offset": 12
    },
    {
      "val": "pa$$w0rd",
      "offset": 23
    }
  ],
  "location": "JobBoardActivity1.whenFunctionName(String,String)"
});
formatter.result({
  "duration": 2923978700,
  "status": "passed"
});
formatter.match({
  "location": "JobBoardActivity1.andFunctionNameMenu()"
});
formatter.result({
  "duration": 2326069400,
  "status": "passed"
});
formatter.match({
  "location": "JobBoardActivity1.andFuntionNameNew()"
});
formatter.result({
  "duration": 2222565200,
  "status": "passed"
});
formatter.match({
  "location": "JobBoardActivity1.thenFunctionNameCreation()"
});
formatter.result({
  "duration": 5063609700,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: //p[contains(.,\u0027New user created. Edit user\u0027)]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-GN1GR7A\u0027, ip: \u00279.79.241.44\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 80.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200818235255, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 11408, moz:profile: C:\\Users\\VijayMoyalan\\AppDa..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d3c809a2-0b70-4a66-8c21-da7b364eb77d\n*** Element info: {Using\u003dxpath, value\u003d//p[contains(.,\u0027New user created. Edit user\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepDefinitions.JobBoardActivity1.thenFunctionNameCreation(JobBoardActivity1.java:61)\r\n\tat ✽.Then Verify the user creation(Job Board_Activity1.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "JobBoardActivity1.andCloseBrowser()"
});
formatter.result({
  "status": "skipped"
});
});