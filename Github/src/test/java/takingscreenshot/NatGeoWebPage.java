package takingscreenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NatGeoWebPage {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.nationalgeographic.com/animals");
	//explicit type casting
	TakesScreenshot ts = (TakesScreenshot)driver;
	//call the getScreenShotAs() with file type
	File screenShot = ts.getScreenshotAs(OutputType.FILE);
	//get the absolute path of the screenshot for refernce
	String screenshotAddress = screenShot.getAbsolutePath();
	System.out.println(screenshotAddress);
	//screen shot will get auto-deleted soon after the execution
	driver.manage().window().minimize();
	driver.quit();
	Thread.sleep(20000);
}
}
