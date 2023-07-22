package com.qspiders.trello.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginToContinue {
	WebDriver driver;

	public TrelloLoginToContinue(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "password")
	private WebElement passwordTextField;

	@FindBy(id = "login-submit")
	private WebElement loginSubmitButton;

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginSubmitButton() {
		return loginSubmitButton;
	}

}
