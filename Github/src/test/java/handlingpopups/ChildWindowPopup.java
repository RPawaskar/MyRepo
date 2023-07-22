package handlingpopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildWindowPopup {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		// trigger the URL with the current window
		driver.get("https://www.nationalgeographic.com/animals");
		// Create one more window with the same object reference.
		driver.switchTo().newWindow(WindowType.WINDOW);
		// set the size of the new Window
		driver.manage().window().setSize(new Dimension(100, 100));
		// This new window is the Child Window Popup
		// Capture all the windows ID
		Set<String> allWindowsId = driver.getWindowHandles();
		// iterate one window Id at a time
		Thread.sleep(4000);
		for (String wid : allWindowsId) {
			String windowTitle = driver.switchTo().window(wid).getTitle();
			if (windowTitle.equals("Animals")) {

			} else {
				driver.close();
			}
		}
	}
}
