package learntestng;

import org.testng.annotations.Test;

public class ClassThree extends TestNGBaseClass{

	@Test(groups = {"compatability"})
	public void nameF() {
		System.out.println("nameF is Executed from ClassThree");
	}
	@Test(groups = {"exploratory"})
	public void nameG() {
		System.out.println("nameG is Executed from ClassThree");
	}
	@Test(groups = {"usability","functional"})
	public void nameH() {
		System.out.println("nameH is Executed from ClassThree");
	}
}
