@PIM
Feature: OrangeHRM

  Background: Login To Organge HRM
    Given Open Orange HRM application
    And Login with Valid Crendetials
    Then Verify User on Dashboad Page

  # @Regression
  #Scenario: Add Employee from PIM page
  # Given Select PIM option
  #And Select Add Employee
  #Then Add Employee Details
  # And Click on Save
  #And Verify Successful Message
  #@Sanity
  # Given Select PIM option
  #And click on EmployeeList
  # Then Search for employee
  @DataTable
  Scenario: Add Employee from PIM page
    Given Select PIM option
    And Select Add Employee
    Then Add the Employee Details
      | First_Name | Middle_Name | Last_Name |
      | Vinayak    | Sonar       | Test      |
      | Sonar      | Vinayak     | Test123   |
      | row1       | row2        | row3      |
      | Dboss      | Gaja        | BullBull  |
    And Click on Save
    And Verify Successful Message
