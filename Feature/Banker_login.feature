Feature: XYZ Bank Bank Manager Application

  Background: 
    Given User Opens the the XYZ Bank application
    And Login as Banker Manager

  Scenario: XYZ Add Customer
  
    Given Verify Add Customer is Page is displayed
    Then Click on Add Customer button
    And Add customer details
    Then Verify Customer added successfully with customer id
    And Click on Home Page
    
    
