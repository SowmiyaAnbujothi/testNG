package TestNg;
import org.testng.annotations.Test;

public class C2{
	
	@Test(groups="Smoke")
	public void Class2TC1()
	{
		System.out.println("Smoke-C2");
	}
	@Test(groups="Regression")
	public void Class2TC2()
	{
		System.out.println("Regression-C2");
	}

}
