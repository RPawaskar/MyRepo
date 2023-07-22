package com.trello.qspiders.endtoend;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.qspiders.trello.genericutility.BaseClass;
import com.qspiders.trello.pomrepository.TrelloBoards;
import com.qspiders.trello.pomrepository.TrelloHomePage;
import com.qspiders.trello.pomrepository.TrelloLogOutPage;
import com.qspiders.trello.pomrepository.TrelloLoginPage;
import com.qspiders.trello.pomrepository.TrelloLoginToContinue;
import com.qspiders.trello.pomrepository.TrelloUserCreatedBoardsPage;

public class TrelloBoardCheck extends BaseClass{
	@Test
	public void createAndDeleteBoard() throws Throwable {
		webdriverUtils.implicitWait(driver);
		TrelloHomePage homePage = new TrelloHomePage(driver);
		homePage.getLoginOption().click();
		TrelloLoginPage loginPage = new TrelloLoginPage(driver);
		loginPage.getEmailTextField().sendKeys(fileUtils.readCommonData("username"));
		loginPage.getContinueSubmitButton().submit();
		TrelloLoginToContinue loginToContinue = new TrelloLoginToContinue(driver);
		webdriverUtils.waitTillElementClickable(driver, loginToContinue.getPasswordTextField()).sendKeys(fileUtils.readCommonData("password"));
		//loginToContinue.getPasswordTextField().sendKeys(fileUtils.readCommonData("password"));
		loginToContinue.getLoginSubmitButton().submit();
		TrelloBoards boardspage = new TrelloBoards(driver);
		boardspage.getCreateNewBoard().click();
		boardspage.getBoardTitletextField().sendKeys(fileUtils.readCommonData("boardtitle"));
//		boardspage.getCreateBoardSubmitButton().click();
		Actions actions = new Actions(driver);
		actions.click(boardspage.getCreateBoardSubmitButton()).perform();
		TrelloUserCreatedBoardsPage createdBoardpage = new TrelloUserCreatedBoardsPage(driver);
//		webdriverUtils.waitTillElementClickable(driver, createdBoardpage.getShowMenuButton()).click();
		createdBoardpage.getShowMenuButton().click();
	
		createdBoardpage.getMoreOption().click();
		createdBoardpage.getCloseBoardOption().click();
		createdBoardpage.getCloseButton().click();
		createdBoardpage.getDeleteBoardButton().click();
		createdBoardpage.getDeleteButton().click();
		boardspage.getProfileIconButton().click();
		boardspage.getLogoutButton().click();
		TrelloLogOutPage logOutPage = new TrelloLogOutPage(driver);
		logOutPage.getLogoutSubmitButton().submit();
		
		
		
		
	}
	@Test(enabled =  false)
	public void createMultipleBoards() throws InterruptedException {
		webdriverUtils.implicitWait(driver);
		TrelloHomePage homepage = new TrelloHomePage(driver);
		homepage.getLoginOption().click();
		Thread.sleep(3000);
	}
}
