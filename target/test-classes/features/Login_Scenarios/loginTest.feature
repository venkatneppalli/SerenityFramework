Feature: login into application
  
  Scenario: As a user I want to login into mah and create new client
    Given I want to navigate to mah application
    When I enter correct user id
    And I enter correct password id
    And I click on signin button
    Then I login successfully
    