package org.stepdef;

import org.base.BaseClass;
import org.junit.Assert;
import org.pojo.AdactHome;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ALoginAdact extends BaseClass{
	
	public AdactHome a;
	
	@Given("To user Launch the browser")
	public void to_user_Launch_the_browser() {
	    launchEdge();
	    windowMaxi();
	}

	@Given("To user pass the valid url")
	public void to_user_pass_the_valid_url() {
		url("http://adactinhotelapp.com/");
	}

	@When("To user pass the valid username and valid password")
	public void to_user_pass_the_valid_username_and_valid_password() {
	   a= new AdactHome();
	   textPass(a.getUsername(), "vaithy2410");
	   textPass(a.getPassword(), "vaithy@2410");
	}

	@When("To user click the login button")
	public void to_user_click_the_login_button() {
	    elementClick(a.getLoginBtn());
	}

	@Then("To validate home page is loaded or not")
	public void to_validate_home_page_is_loaded_or_not() {
		toWait();
		Assert.assertTrue("Invalid Credentials...!", elementLocatorByXpath("//td[text()='Search Hotel ']").isDisplayed());
	    System.out.println("Login Successful");
	}

}
