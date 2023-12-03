package Disney.Disney;

import org.testng.annotations.Test;

import pomClasses.HomePage;
import pomClasses.ShowPage;

public class ViewHomeTest extends BaseClass{

	@Test
	public void viewHome() throws InterruptedException {
		HomePage home=new HomePage(driver);
		ShowPage show=new ShowPage(driver);
		home.getShows().click();
		Thread.sleep(3000);
		show.getShowsdropdown().click();
		Thread.sleep(3000);
		
		
	}
}
