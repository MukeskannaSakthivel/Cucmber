Feature: To validate select functionality

  Scenario Outline: To validate hotel is selected
    Given user launch adactin application
    And user enter username "<username>" and password "<password>"
    And user click login button
    And To user pass the Location "<location>",Hotels "<hotels>",RoomType"<roomType>",NoofRooms"<noOfRooms>",CheckInDate"<checkIn>",CheckOutDate"<checkOut>",AdultsPerRoom"<adults>",ChildPerRoom"<children>"
    And To user click the search button
    When To user select one hotel and To user click continue
    Then To user check payment page is loaded or not

    Examples: 
      | username   | password    | location | hotels       | roomType | noOfRooms | checkIn    | checkOut   | adults | children |
      | vaithy2410 | vaithy@2410 | London   | Hotel Hervey | Deluxe   |         2 | 22/09/2023 | 25/09/2023 |      3 |        2 |
