package takingscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LearnToMoveScreenShot {
	@Test(invocationCount = 5)
	public void myFirstScreenShot() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.nationalgeographic.com/animals");
		Thread.sleep(5000);
		// explicit type casting
		TakesScreenshot ts = (TakesScreenshot) driver;
		// call the getscreenshotAs() with file type
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		// create the new file location to store the screen shot
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		File destFile = new File("./errorshots/" + timeStamp + "natGeo.png");
		// call the class called FileUtils from commons-io library

		// it will take the copy of the screeenshot to the new location before it has
		// got deleted.
		FileUtils.copyFile(srcFile, destFile);
		driver.manage().window().minimize();
		driver.quit();

	}
}
