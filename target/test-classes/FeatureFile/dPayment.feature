Feature: To validate payment functionality

  Scenario: To validate payment by provide valid details
    Given To user launch the browser and pass the valid url
    And To user pass valid credentials and click login
    And To user pass the Location,Hotels,RoomType,NoofRooms,CheckInDate,CheckOutDate,AdultsPerRoom,ChildPerRoom and click the search button
    And To user select one hotel and To user click continue
    When To user pass the valid firstname,lastname,billing address,creditcardnumber,creditcardtype,expirydate,cvv
    And To user click the book now
    Then To user validate orderno generated
