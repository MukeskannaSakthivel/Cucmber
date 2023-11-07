Feature: To validate select functionality

Scenario: To validate hotel is selected

Given To user launch the browser and pass the valid url
And To user pass valid credentials and click login
And To user pass the Location,Hotels,RoomType,NoofRooms,CheckInDate,CheckOutDate,AdultsPerRoom,ChildPerRoom and Click search button

When To user select one hotel and To user click continue

Then To user check payment page is loaded or not