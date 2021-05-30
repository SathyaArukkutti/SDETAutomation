package TestNG;


import org.testng.annotations.Test;


public class Invocation {
	
	@Test(invocationCount=5,invocationTimeOut=200)
	public void ctest() {
		try {
		Thread.sleep(3000);}
		catch(Exception e) {}
		System.out.println("Test1 executed .....");
	}
	
	

}
