package com.qspiders.trello.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloUserCreatedBoardsPage {
	WebDriver driver;

	public TrelloUserCreatedBoardsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "button[aria-label='Show menu']")
	private WebElement showMenuButton;

	@FindBy(xpath = "//a[contains(.,'More')]")
	private WebElement moreOption;

	@FindBy(xpath = "//a[contains(.,'Close board')]")
	private WebElement closeBoardOption;

	@FindBy(css = "input[value='Close']")
	private WebElement closeButton;

	@FindBy(xpath = "//button[.='Permanently delete board']")
	private WebElement deleteBoardButton;

	@FindBy(xpath = "//button[.='Delete']")
	private WebElement deleteButton;

	public WebElement getShowMenuButton() {
		return showMenuButton;
	}

	public WebElement getMoreOption() {
		return moreOption;
	}

	public WebElement getCloseBoardOption() {
		return closeBoardOption;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}

	public WebElement getDeleteBoardButton() {
		return deleteBoardButton;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

}
