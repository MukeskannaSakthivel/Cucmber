Feature: To validate login functioanlity

  Background: 
    Given To user Launch the browser
    And To user pass the valid url

  Scenario: To Validate login with inValid username and valid password
    When To user pass the inValid username and valid password 
      | QERTTt | vaithy@2410 |
    And To user click the login button
    Then To validate the username and password using Assertion
    And To validate home page is loaded or not

  Scenario: To Validate login with invalid username and invalid password
    When To user pass the invalid username and invalid password
      | sdulGhdsb  | yfjgchh     |
      | ytdjgfhmgf | mhkfjtjhkgk |
    And To user click the login button
    Then To validate the username and password using Assertion
    And To validate home page is loaded or not

  Scenario: To Validate login with valid username and invalid password
    When To user pass the valid username and invalid password
      | username | vaithy2410 |
      | password | vaith2410  |
    And To user click the login button
    Then To validate the username and password using Assertion
    And To validate home page is loaded or not

  Scenario: To Validate login with valid username and valid password
    When To user pass the valid username and valid password
      | username   | password    |
      | vaithy2410 | vaithy@2410 |
      | vaithy2410 | vaithy@2410 |
    And To user click the login button
    Then To validate the username and password using Assertion
    And To validate home page is loaded or not
