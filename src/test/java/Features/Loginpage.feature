@wip
Feature: Login
  Scenario: Successful login
    Given user launch the url
    When user clicks on signin button
    And user enter username "testautomation61@gmail.com"
    And user enter password "Doctorbig2021"
    And user clicks on signin button1
    Then user  is on login page
