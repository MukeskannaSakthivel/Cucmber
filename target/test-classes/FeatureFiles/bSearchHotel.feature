Feature: To validate the Search functionality

  Scenario Outline: To validate login using different set of credentials
    Given user launch adactin application
    And user enter username "<username>" and password "<password>"
    And user click login button
    When To user pass the Location "<location>",Hotels "<hotels>",RoomType"<roomType>",NoofRooms"<noOfRooms>",CheckInDate"<checkIn>",CheckOutDate"<checkOut>",AdultsPerRoom"<adults>",ChildPerRoom"<children>"
    And To user click the search button
    Then To user check the next page loaded

    Examples: 
      | username   | password    | location  | hotels         | roomType | noOfRooms | checkIn     | checkOut   | adults | children |
      | vaithy2410 | vaithy@2410 | London    | Hotel Hervey   | Deluxe   |         2 | 22/09/2023  | 25/09/2023 |      3 |        2 |
      | vaithy2410 | vaithy@2410 | Melbourne | Hotel Sunshine | Standard |         4 | 14/010/2023 | 22/10/2023 |      2 |        1 |
