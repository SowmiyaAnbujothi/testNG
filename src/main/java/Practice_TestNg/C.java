package Practice_TestNg;

import org.testng.annotations.Test;

import TestNg.BaseClass;

public class C {
	public class C1 extends BaseClass{
		@Test
		public void testCase1() {
			System.out.println("C--TC1");
		}

		@Test
		public void testCase2() {
			System.out.println("C--TC2");
		}

	}
}
