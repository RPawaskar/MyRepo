package learntestng;

import org.testng.annotations.Test;

public class ClassTwo extends TestNGBaseClass {
	@Test(groups = {"system","smoke"})
	public void nameD() {
		System.out.println("nameD is Executed from ClassTwo");
	}
	@Test(groups = {"integration", "functional"})
	public void nameE() {
		System.out.println("nameE is Executed from ClassTwo");
	}
}
