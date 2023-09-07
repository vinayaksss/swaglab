Feature: Admin Feature

  Background: Login To Organge HRM
    Given Open Orange HRM application
    And Login with Valid Crendetials
    Then Verify User on Dashboad Page

    
  @Admin 
  Scenario: Verify and Get all the Employee details
    Given Select Admin option from Left menu options
    Then Click on Job Title under Job Section
    And Verify user is on Admin page
    Then Check all the job titles
    
    
    