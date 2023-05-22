package Practice_TestNg;

import org.testng.annotations.Test;

import TestNg.BaseClass;

public class A {
		@Test(dependsOnMethods={"C"})
		public void B() {
			System.out.println("B");
		}

		@Test(dependsOnMethods={"B"})
		public void A() {
			System.out.println("A");
		}
		@Test(priority=0)
		public void C() {
			System.out.println("C");
		}
		@Test(priority=-1)
		public void D() {
			System.out.println("D");
		}

		@Test(priority=0)
		public void E() {
			System.out.println("E");
		}
		@Test(dependsOnMethods={"B"})
		public void F() {
			System.out.println("F");
		}
		@Test(dependsOnMethods={"D"})
		public void G() {
			System.out.println("G");
		}
		
}
