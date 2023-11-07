package org.stepdef;

import org.base.BaseClass;
import org.junit.Assert;
import org.pojo.AdactHome;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BSearchHotel extends BaseClass {

	public AdactHome a;

	@Given("To user launch the browser and pass the valid url")
	public void to_user_launch_the_browser_and_pass_the_valid_url() {
		launchEdge();
		windowMaxi();
		url("http://adactinhotelapp.com/");
	}

	@Given("To user pass valid credentials and click login")
	public void to_user_pass_valid_credentials_and_click_login() {
		a = new AdactHome();
		textPass(a.getUsername(), "vaithy2410");
		textPass(a.getPassword(), "vaithy@2410");
		elementClick(a.getLoginBtn());
	}

	@When("To user pass the Location,Hotels,RoomType,NoofRooms,CheckInDate,CheckOutDate,AdultsPerRoom,ChildPerRoom")
	public void to_user_pass_the_Location_Hotels_RoomType_NoofRooms_CheckInDate_CheckOutDate_AdultsPerRoom_ChildPerRoom() {
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
	}

	@When("To user click the search button")
	public void to_user_click_the_search_button() {
		elementClick(a.getSearch());
	}

	@Then("To user check the next page loaded")
	public void to_user_check_the_next_page_loaded() {
		toWait();
		Assert.assertTrue("Enter Valid details", elementLocatorByXpath("//td[text()='Select Hotel ']").isDisplayed());
		System.out.println("Searched Successful");
	}

}
