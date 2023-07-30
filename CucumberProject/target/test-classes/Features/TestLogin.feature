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
Feature: Test login functionality of facebook login2

  Scenario Outline: Test functionality of facebook
    Given user is on login page2
    When Enter2 <username> and <password>
    And click on login button2
    Then user should land on home page2

    Examples: 
      | uname                | pwd          |
      | prakash13k@gmail.com | Drithika@123 |
