@JBactivity4
Feature: Using Examples table to post a job
  using a Scenario Outline and Examples table to post a job

  @tag1
  Scenario Outline: job posting using parameterization
    Given Open job sites URL
    And Go to Post a Job page
    When job information details is filled "<email>" "<title>" "<description>" "<website>" "<company>"
    Then Goto the Jobs page
    And Confirm job listing "<title>"
    And Close browser
    
    Examples:
    |email|title|appemail|website|company|
    |jobvjm@gmail.com|TestSDET|application@alk.com|www.sdet.com|IBM|
