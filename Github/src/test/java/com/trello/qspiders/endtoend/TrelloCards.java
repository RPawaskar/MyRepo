package com.trello.qspiders.endtoend;

import org.testng.annotations.Test;

import com.qspiders.trello.genericutility.BaseClass;
import com.qspiders.trello.pomrepository.TrelloHomePage;

public class TrelloCards extends BaseClass{
	@Test
	public void createMultipleCardsInSameList() throws Throwable {
		webdriverUtils.implicitWait(driver);
		TrelloHomePage homepage = new TrelloHomePage(driver);
		homepage.getLoginOption().click();
		Thread.sleep(3000);
	}
}
