
#This is login feature testcase
Feature: This is Login page feature
  I want to login successfully

@login
  Scenario: Title of your scenario
    Given User is on login page
    When User enters right username "apurupa@gmail.com"
    And User enters the password "password"
    And Clicks on submit
    Then User should be on home page

 