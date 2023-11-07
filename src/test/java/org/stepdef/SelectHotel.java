package org.stepdef;

import org.utility.AdactHome;
import org.utility.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectHotel extends BaseClass{

	public AdactHome a;
	@When("To user select one hotel and To user click continue")
	public void to_user_select_one_hotel_and_To_user_click_continue() {
	   a=new AdactHome();
	   elementClick(a.getRadioBtn());
	   elementClick(a.getCont());
	}

	@Then("To user check payment page is loaded or not")
	public void to_user_check_payment_page_is_loaded_or_not() {
	    
	}
	
}
