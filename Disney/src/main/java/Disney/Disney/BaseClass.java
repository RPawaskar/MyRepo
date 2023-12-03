package Disney.Disney;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pomClasses.HomePage;

public class BaseClass {
	
	public WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		driver=new ChromeDriver();
		HomePage home=new HomePage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://disneynow.com/");
		home.getPopup().click();
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.manage().window().minimize();
		driver.quit();
	}

}
