Feature: To validate the Search functionality

  Scenario: To validate Search by passing all the required fields
    Given To user launch the browser and pass the valid url
    And To user pass valid credentials and click login
    When To user pass the Location,Hotels,RoomType,NoofRooms,CheckInDate,CheckOutDate,AdultsPerRoom,ChildPerRoom
    And To user click the search button
    Then To user check the next page loaded
