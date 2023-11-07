package org.stepdef;

import org.utility.AdactHome;
import org.utility.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchHotel extends BaseClass{
	
	public AdactHome a;
	@When("To user pass the Location {string},Hotels {string},RoomType{string},NoofRooms{string},CheckInDate{string},CheckOutDate{string},AdultsPerRoom{string},ChildPerRoom{string}")
	public void to_user_pass_the_Location_Hotels_RoomType_NoofRooms_CheckInDate_CheckOutDate_AdultsPerRoom_ChildPerRoom(String location, 
			String hotel, String roomType, String noOfRooms, String checkIn, String checkOut, String adults, String children) {
	    a=new AdactHome();
	    selByValue(a.getLocation(), location);
	    selByValue(a.getHotels(), hotel);
	    selByValue(a.getRoomType(), roomType);
	    selByValue(a.getNoOfRooms(), noOfRooms);
	    a.getChechkIn().clear();
	    textPass(a.getChechkIn(), checkIn);
	    a.getCheckOut().clear();
	    textPass(a.getCheckOut(), checkOut);
	    selByValue(a.getNoOfAdult(), adults);
	    selByValue(a.getNoOfChild(), children);
	}
	
	@When("To user click the search button")
	public void to_user_click_the_search_button() {
		a = new AdactHome();
		elementClick(a.getSearch());
	}
	
	@Then("To user check the next page loaded")
	public void to_user_check_the_next_page_loaded() {
	 
	}
}

