package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Sample {
	@Test
	public void test1() {
		System.out.println("Test1 executed .....");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2 executed .....");
	}
	
	@Test
	public void test3() {
		System.out.println("Test3	 executed .....");
	}

	@BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method.....");
  }

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method.....");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class.....");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after Class.....");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test.....");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("after Test.....");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite.....");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite.....");
	}

}
