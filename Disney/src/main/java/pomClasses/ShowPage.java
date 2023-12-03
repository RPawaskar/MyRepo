package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Disney.Disney.BaseClass;

public class ShowPage extends BaseClass {

		public ShowPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
	}
		public WebElement getShowsdropdown() {
			return showsdropdown;
		}
		@FindBy(xpath="//div[@class='allShowsDropdownMenu__title']")
		private WebElement showsdropdown;
	}

