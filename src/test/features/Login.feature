Feature: Login

  Background: User access login page

    Scenario: Successful login
      Given User access login page
      When User type in username
      And User type in password
      And User click login button
      Then User access products page

