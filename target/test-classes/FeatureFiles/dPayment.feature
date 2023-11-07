Feature: To validate payment functionality

  Scenario Outline: To validate payment by provide valid details
    Given user launch adactin application
    And user enter username "<username>" and password "<password>"
    And user click login button
    And To user pass the Location "<location>",Hotels "<hotels>",RoomType"<roomType>",NoofRooms"<noOfRooms>",CheckInDate"<checkIn>",CheckOutDate"<checkOut>",AdultsPerRoom"<adults>",ChildPerRoom"<children>"
    And To user click the search button
    And To user select one hotel and To user click continue
    When To user pass the valid firstName"<fName>",lastName"<lName>",billing address"<address>",credit card number"<ccNumber>",credit card type"<ccType>",expiry month"<month>",expiry year"<year>",cvv"<cvv>"
    And To user click the book now
    Then To user validate orderno generated

    Examples: 
      | username   | password    | location | hotels       | roomType | noOfRooms | checkIn    | checkOut   | adults | children | fName | lName | address | ccNumber         | ccType | month | year | cvv |
      | vaithy2410 | vaithy@2410 | London   | Hotel Hervey | Deluxe   |         3 | 22/09/2023 | 25/09/2023 |      2 |        1 | Ravi  | Kumar | Erode   | 1234567890765432 | VISA   |     3 | 2027 | 123 |
