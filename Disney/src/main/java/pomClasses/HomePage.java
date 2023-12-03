package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Disney.Disney.BaseClass;

public class HomePage extends BaseClass {
//	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "svg[class='icon--color icon__svg']")
	private WebElement popup;
	
	public WebElement getPopup() {
		return popup;
	}

	@FindBy(xpath = "//span[text()='home']")
	private WebElement home;

	public WebElement getHome() {
		return home;
	}
	@FindBy (xpath = "//span[text()='shows']")
	private WebElement shows;

	public WebElement getShows() {
		return shows;
	}
	@FindBy (xpath = "//span[text()='games']")
	private WebElement games;
	
	public WebElement getGames() {
		return games;
	}
	@FindBy (xpath= "//span[text()='disney channel original movies']")
	private WebElement dcom;

	public WebElement getDcom() {
		return dcom;
	}

	}

