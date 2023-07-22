package learntestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Check {
	@Test
	@Parameters("browser")
	public void testCase(String browser) {
		System.out.println("testCase Executed");
		System.out.println(browser);
	}
}
