package learntestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGBaseClass {
	@BeforeMethod
	public void configBeforeMethod() {
		System.out.println("configBeforeMethod is executed");
	}
	@AfterMethod
	public void configAfterMethod() {
		System.out.println("configAfterMethod is executed");
	}
	@BeforeClass
	public void configBeforeClass() {
		System.out.println("configBeforeClass is executed");
	}
	@AfterClass
	public void configAfterClass() {
		System.out.println("configAfterClass is executed");
	}
	@BeforeTest
	public void configBeforeTest() {
		System.out.println("configBeforeTest is executed");
	}
	@AfterTest
	public void configAfterTest() {
		System.out.println("configAfterTest is executed");
	}
	@BeforeSuite
	public void configBeforeSuite() {
		System.out.println("configBeforeSuite is executed");
	}
	@AfterSuite
	public void configAfterSuite() {
		System.out.println("configAfterSuite is executed");
	}
}
