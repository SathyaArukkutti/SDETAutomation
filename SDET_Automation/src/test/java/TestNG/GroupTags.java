package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTags {
	@Test(groups={"smoke"})
	public void test1() {
		System.out.println("smoke1 executed .....");
	}
	
	@Test(enabled=false)
	public void test5() {
		System.out.println("smoke1 executed .....");
	}
	
	@Test(groups={"Regression"})
	public void test2() {
		System.out.println("Regression1 executed .....");
		Assert.assertEquals(false, true);
	}
	
	@Test(dependsOnGroups={"Regression"})
	public void test3() {
		System.out.println("Depends on Test2 Regression .....");
	}
	
	@Test(dependsOnMethods={"test3"})
	public void test4() {
		System.out.println("Depends on Test3  .....");
	}
	
	@Test(dependsOnMethods={"test3"},alwaysRun=true)
	public void test6() {
		System.out.println("Depends on Test3 but will always run no matter wht  .....");
	}

}
