
Feature: Recrutiment Feature 

  Background: Login To Organge HRM
    Given Open Orange HRM application
    And Login with Valid Crendetials
    Then Verify User on Dashboad Page

  @Sanity
  Scenario: Search for Vacancies Based on Status
  Given Select Recrutiment option from Left menu option
  And click Vacancies button 
  Then Select "Active" from the dropDown
  And click on search button
  And Get the details of records
  Then Verify the Number of Records
  And Click on Reset button
  Then Select "Closed" from the dropDown
  And click on search button
  Then Verify the Number of Records
  
  
  @Recrutiment
  Scenario: Search for Vacancies Based on Status
  Given Select Recrutiment option from Left menu option
  And click Vacancies button 
  Then Select "Active" from the dropDown
  And click on search button
  Then Get the details of "Junior Account Assistant"
  
   
  
  
  
  
  
  
