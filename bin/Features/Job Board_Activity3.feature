@JBactivity3
Feature: Posting a job using parameterization
	Post a job using details passed from the Feature file

  @tag1
  Scenario Outline: job posting using parameterization
    Given Open jobs sites URL
    And Go to Post a Job pages
    When job information detail is filled "testcase3@gmail.com" "Tester TC3" "SDET Tester TC3" "www.testcase3.com" "IBM"
    Then Goto the Job page
    And Confirm job listings "Tester TC3"
    And Close browsers