#Author:Vinayak Sonar
Feature: Login To SwagLabs Functionality

  Background: 
  
    And Open the SwagLabs UrL

  @DataTable
  Scenario: Login to SwagLabs application with Valid Crendentials
    And Enter UserName "problem_user"
    And Enter Password "secret_sauce123"
    And Click on Submit
    Then Verify page Tittle
    And Click on Main menu
    Then Click Logout
  
  
  Scenario Outline: Login to SwagLabs application with Valid Crendentials
    And Enter UserName "<UserName>"
    And Enter Password "<Password>"
    And Click on Submit
    Then Verify page Tittle
    And Click on Main menu
    Then Click Logout

    Examples: 
      | UserName                |  | Password     |
      | problem_user            |  | secret_sauce123|
      | standard_user           |  | secret_sauce |
      | performance_glitch_user |  | secret_sauce |
