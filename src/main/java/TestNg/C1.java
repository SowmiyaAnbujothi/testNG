package TestNg;

import org.testng.annotations.Test;

public class C1{
	@Test(groups="Smoke")
	public void testCase1() {
		System.out.println("Smoke-C1");
	}

	@Test(groups="Regression")
	public void testCase2() {
		System.out.println("Regression-TC2");
	}

}
