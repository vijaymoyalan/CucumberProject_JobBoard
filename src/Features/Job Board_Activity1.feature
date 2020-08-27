#Author: Vijay Moyalan
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Visit the site’s backend and create a new user

@JBactivity1
Feature: Create a new user for Job-board system.
  Visit the site’s backend and create a new user

  @tag1
  Scenario Outline: Visit the site backend and create a new user
    Given Open wp admin URL
    When User enter "<Username>" and "<Password>"
    And Click on menu item Users
    And Click on Add New button fill details and click on new button
    Then Verify the user creation
    And Close the browser
    
Examples:
|Username|Password|
|root|pa$$w0rd|