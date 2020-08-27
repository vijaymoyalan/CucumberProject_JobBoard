#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@JBactivity2
Feature: Searching for jobs and applying to them using XPath
  Searching for jobs using XPath

  @tag1
  Scenario Outline: Searching for jobs using XPath
    Given Open job site URL
    When User clicks Jobs for job list
    And Clicks on keywords text field for "<Job>" search
    And Search for Full Time jobs
    When User clicks Jobs for job list
    And Clicks on keywords text field for "<Job>" search
    And print the job title
    Then User clicks on apply for job
    And Close the browser
 
 Examples:   
|Job|
|DIN|
