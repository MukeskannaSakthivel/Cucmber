package org.stepdef;

import org.base.BaseClass;
import org.junit.Assert;
import org.pojo.AdactHome;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DPayment extends BaseClass {

	public AdactHome a;

	@Given("To user pass the Location,Hotels,RoomType,NoofRooms,CheckInDate,CheckOutDate,AdultsPerRoom,ChildPerRoom and click the search button")
	public void to_user_pass_the_Location_Hotels_RoomType_NoofRooms_CheckInDate_CheckOutDate_AdultsPerRoom_ChildPerRoom_and_click_the_search_button() {
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

	@When("To user pass the valid firstname,lastname,billing address,creditcardnumber,creditcardtype,expirydate,cvv")
	public void to_user_pass_the_valid_firstname_lastname_billing_address_creditcardnumber_creditcardtype_expirydate_cvv() {
		a = new AdactHome();
		textPass(a.getFirstName(), "Ravi");
		textPass(a.getLastName(), "Kumar");
		textPass(a.getAddress(), "Erode");
		textPass(a.getCardNumber(), "8767 4569 7867 4314");
		selByValue(a.getCardType(), "VISA");
		selByValue(a.getMonth(), "3");
		selByValue(a.getYear(), "2024");
		textPass(a.getCvv(), "123");
	}

	@When("To user click the book now")
	public void to_user_click_the_book_now() {
		a = new AdactHome();
		elementClick(a.getBookNow());
	}

	@Then("To user validate orderno generated")
	public void to_user_validate_orderno_generated() {
		a=new AdactHome();
		toWait();
		Assert.assertTrue("Hotel Booking Failed ..!", elementLocatorByXpath("//td[text()='Booking Confirmation ']").isDisplayed());
		System.out.println("Order No: " + a.getOrderNo().getAttribute("Value"));
	}

}
