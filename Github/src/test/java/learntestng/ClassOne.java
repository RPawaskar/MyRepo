package learntestng;

import org.testng.annotations.Test;

public class ClassOne extends TestNGBaseClass{
	@Test(groups = {"functional","adhoc"})
	public void nameA() {
		System.out.println("nameA is Executed from ClassOne");
	}
	@Test(groups = {"functional"})
	public void nameB() {
		System.out.println("nameB is Executed from ClassOne");
	}
	@Test(groups = {"system"})
	public void nameC() {
		System.out.println("nameC is Executed from ClassOne");
	}
}
