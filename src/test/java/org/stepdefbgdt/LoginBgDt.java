package org.stepdefbgdt;

import java.util.List;
import java.util.Map;

import org.utility.AdactHome;
import org.utility.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.datatable.DataTable;

public class LoginBgDt extends BaseClass {

	public AdactHome a;

	@Given("To user Launch the browser")
	public void to_user_Launch_the_browser() {
		launchBrowser();
		windowMaxi();

	}

	@Given("To user pass the valid url")
	public void to_user_pass_the_valid_url() {
		url("http://adactinhotelapp.com/");
	}

	@When("To user pass the inValid username and valid password")
	public void to_user_pass_the_inValid_username_and_valid_password(DataTable d) {
		a = new AdactHome();
		List<String> list = d.asList();
		textPass(a.getUsername(), list.get(0));
		textPass(a.getPassword(), list.get(1));

	}

	@When("To user click the login button")
	public void to_user_click_the_login_button() {
		a = new AdactHome();
		elementClick(a.getLoginBtn());
	}

	@Then("To validate the username and password using Assertion")
	public void to_validate_the_username_and_password_using_Assertion() {

	}

	@Then("To validate home page is loaded or not")
	public void to_validate_home_page_is_loaded_or_not() {

	}

	@When("To user pass the invalid username and invalid password")
	public void to_user_pass_the_invalid_username_and_invalid_password(DataTable d) {

		a = new AdactHome();
		List<List<String>> li = d.asLists();
		textPass(a.getUsername(), li.get(1).get(0));
		textPass(a.getPassword(), li.get(1).get(1));
	}

	@When("To user pass the valid username and invalid password")
	public void to_user_pass_the_valid_username_and_invalid_password(DataTable d) {

		a = new AdactHome();
		Map<String, String> map = d.asMap(String.class, String.class);

		textPass(a.getUsername(), map.get("username"));
		textPass(a.getPassword(), map.get("password"));
	}

	@When("To user pass the valid username and valid password")
	public void to_user_pass_the_valid_username_and_valid_password(DataTable d) {
		a = new AdactHome();
		List<Map<String, String>> maps = d.asMaps();
		
		textPass(a.getUsername(), maps.get(1).get("username"));
		textPass(a.getPassword(), maps.get(1).get("password"));
		
	}
}
