@login
Feature: Login

  @valid-login
  Scenario: Login using valid email and password
    Given user is on login page
    When user input email text box with "standard_user"
    And user input password text box with "secret_sauce"
    When user click login button
    Then user will redirect to homepage


  @invalid-login
  Scenario: Login using invalid email and password
    Given user is on login page
    When user input email text box with "wrong_user"
    And user input password text box with "secret_sauce"
    When user click login button
    Then user will see error message "Epic sadface: Username and password do not match any user in this service"
