@add-to-cart
Feature: Add to cart

  @valid-add-to-cart
  Scenario: Add to cart 1 item from homepage
    Given user login with valid email "standard_user" and password "secret_sauce"
    And user is on homepage
    When user click button add to cart
    Then user will see icon cart count is "1"


