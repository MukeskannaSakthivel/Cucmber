package org.stepdef;

import org.utility.AdactHome;
import org.utility.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Payment extends BaseClass {

	public AdactHome a;

@When("To user pass the valid firstName{string},lastName{string},billing address{string},credit card number{string},credit card type{string},expiry month{string},expiry year{string},cvv{string}")
public void to_user_pass_the_valid_firstName_lastName_billing_address_credit_card_number_credit_card_type_expiry_month_expiry_year_cvv(String fName, String lName, String address,
		String ccNumber, String ccType, String month, String year, String cvv) {
    a=new AdactHome();
    textPass(a.getFirstName(), fName);
    textPass(a.getLastName(), lName);
    textPass(a.getAddress(), address);
    textPass(a.getCardNumber(), ccNumber);
    selByValue(a.getCardType(), ccType);
    selByValue(a.getMonth(),month);
    selByValue(a.getYear(), year);
    textPass(a.getCvv(), cvv);
}

@When("To user click the book now")
public void to_user_click_the_book_now() {
   a=new AdactHome();
   elementClick(a.getBookNow());
}

@Then("To user validate orderno generated")
public void to_user_validate_orderno_generated() {
    
}
	
}
