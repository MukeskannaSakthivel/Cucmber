package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHome extends BaseClass {
	public FacebookHome() {
	
	PageFactory.initElements(driver, this);
	
	}
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(name="pass")
	private WebElement password;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//div[contains(text(),'The pa')]")
	private WebElement errorMsg;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getErrorMsg() {
		return errorMsg;
	}
	
	
}
