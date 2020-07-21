@SmokeTest
Feature: I want to verify search hotel with different input data

  Background: 
    Given I want to login into application

  @SmokeTest @TC001
  Scenario: search hotel by location type on search hotel page
    When I select location type as "London" from dropdown
    And select other mandatory fields
    And click on search button
    Then I validate the location on select hotel page
    
    
    