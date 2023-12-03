package Disney.Disney;

import org.testng.annotations.Test;

import pomClasses.HomePage;
import pomClasses.ShowPage;

public class ViewShowTest extends BaseClass{
	@Test
public void viewShow() {
		HomePage home=new HomePage(driver);
		home.getShows().click();
		ShowPage show=new ShowPage(driver);
		show.getShowsdropdown().click();
	}
}
