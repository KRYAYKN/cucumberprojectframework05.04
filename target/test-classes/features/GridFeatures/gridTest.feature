@GRID
Feature: GRID_TEST
  @chrome
  Scenario: TC01_GRID_TEST_CHROME
    Given user is on he homepage "https://techproeducation.com" by chrome
    Then verify title has "Techpro Education"
    And close the remote driver

  @edge
  Scenario: TC01_GRID_TEST_EDGE
    Given user is on he homepage "https://techproeducation.com" by edge
    Then verify title has "Techpro Education"
    And close the remote driver

  @firefox
  Scenario: TC01_GRID_TEST_FIREFOX
    Given user is on he homepage "https://techproeducation.com" by firefox
    Then verify title has "Techpro Education"
    And close the remote driver