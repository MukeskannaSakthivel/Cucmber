package org.stepdef;

import org.base.BaseClass;
import org.junit.Assert;
import org.pojo.AdactHome;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CSelectHotel extends BaseClass{
	
	public AdactHome a;
	

	@Given("To user pass the Location,Hotels,RoomType,NoofRooms,CheckInDate,CheckOutDate,AdultsPerRoom,ChildPerRoom and Click search button")
	public void to_user_pass_the_Location_Hotels_RoomType_NoofRooms_CheckInDate_CheckOutDate_AdultsPerRoom_ChildPerRoom_and_Click_search_button() {
		a = new AdactHome();
		selByValue(a.getLocation(), "London");
		selByValue(a.getHotels(), "Hotel Hervey");
		selByValue(a.getRoomType(), "Deluxe");
		selByValue(a.getNoOfRooms(), "2");
		a.getChechkIn().clear();
		textPass(a.getChechkIn(), "14/09/2023");
		a.getCheckOut().clear();
		textPass(a.getCheckOut(), "18/09/2023");
		selByValue(a.getNoOfAdult(), "2");
		selByValue(a.getNoOfChild(), "1");
		elementClick(a.getSearch());
	}

	@When("To user select one hotel and To user click continue")
	public void to_user_select_one_hotel_and_To_user_click_continue() {
		a = new AdactHome();
	    elementClick(a.getRadioBtn());
	    elementClick(a.getCont());
	}

	@Then("To user check payment page is loaded or not")
	public void to_user_check_payment_page_is_loaded_or_not() {
		toWait();
		Assert.assertTrue("Invalid Selection..",elementLocatorByXpath("//td[text()='Book A Hotel ']").isDisplayed());
	    System.out.println("Hotel Selected Successfully");
	}

}
