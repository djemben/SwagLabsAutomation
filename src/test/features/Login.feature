Feature: Login

  Background: User access login page

    Scenario: Successful login
      When User type in username
      And User type in password
      And User click login button
      Then User access products page

      Scenario: Successful logout
        When User type in username
        And User type in password
        And User click login button
        And User access products page
        And User select logout from hamburger menu
        Then User access login page

