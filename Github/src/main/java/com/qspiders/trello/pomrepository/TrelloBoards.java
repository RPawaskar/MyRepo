package com.qspiders.trello.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloBoards {
	WebDriver driver;

	public TrelloBoards(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[.='Create new board']")
	private WebElement createNewBoard;

	@FindBy(css = "input[data-testid='create-board-title-input']")
	private WebElement boardTitletextField;

	@FindBy(css = "button[data-testid='create-board-submit-button']")
	private WebElement createBoardSubmitButton;

	@FindBy(css = "button[aria-label='Open member menu']")
	private WebElement profileIconButton;

	@FindBy(xpath = "//button[.='Log out']")
	private WebElement logoutButton;

	public WebElement getCreateNewBoard() {
		return createNewBoard;
	}

	public WebElement getBoardTitletextField() {
		return boardTitletextField;
	}

	public WebElement getCreateBoardSubmitButton() {
		return createBoardSubmitButton;
	}

	public WebElement getProfileIconButton() {
		return profileIconButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

}
