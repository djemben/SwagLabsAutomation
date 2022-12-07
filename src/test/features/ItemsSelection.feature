Feature: Inventory selection

  Background:
    Given Given User logged in

  @cart
  Scenario: User add any item to cart
    When User add one item to cart
    And Cart icon shows number of added items
    Then Cart contains selected items

  Scenario: User add two items to cart
    When User add two items to cart
    Then Cart contains selected items

  Scenario: User add all items to cart
    When User add all items to cart
    Then Cart contains selected items

  Scenario: User unselect one item
    When User add <quantity> items to cart
    And User unselect one item
    Then Cart contains selected items

  Scenario: User unselect all items
    When User add <quantity> items to cart
    And User unselect all items
    Then Cart is empty