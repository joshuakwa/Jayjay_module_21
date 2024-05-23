@logout
Feature: Logout

  @valid-logout
  Scenario: Logout when user already logged in
    Given user login with valid email "standard_user" and password "secret_sauce"
    And user is on homepage
    When user click hamburger
    And user click logout button
    Then user will redirect to login page


