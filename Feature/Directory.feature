Feature: Directory Feature

  Background: Login To Organge HRM
    Given Open Orange HRM application
    And Login with Valid Crendetials
    Then Verify User on Dashboad Page

  @Directory
  Scenario: Verify and Get all the Employee details
    Given Select Directory option from Left menu options
    Then Get the number records and details

  @Directory
  Scenario: Verify and Get all the Employee details
    Given Select Directory option from Left menu options
    And Get all the Job Tittle dropdown list
    Then Get all the Location dropdown list
    
    