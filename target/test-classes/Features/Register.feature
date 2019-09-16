
Feature: Register flow

 @regression
  Scenario: 
  Given click on login button
    Given choose the gender
    And enter the email address
    When enter first name
    And enter last name
    And enter password
    And confirm the password
    Then click on the register button
   