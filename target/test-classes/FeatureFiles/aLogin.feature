Feature: To validate login functionality

  Scenario Outline: To validate login using different set of credentials
    Given user launch adactin application
    When user enter username "<username>" and password "<password>"
    And user click login button
    Then user see the results based on credential type "<credentialType>"

    Examples: 
      | username   | password    | credentialtype |
      | vaithy2410 | vaithy@2410 | positive       |
