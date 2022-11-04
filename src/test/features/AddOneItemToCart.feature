Feature: Inventory selection

  Background:
    Given Given User logged in

  @cart
  Scenario: User adds any item to cart
    When User add one item to cart
    Then Cart contains selected items

  Scenario: User adds two items to cart
    When User add two items to cart
    Then Cart contains selected items