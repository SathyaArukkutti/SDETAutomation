package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test(priority=1, description="to be exeucted frist", timeOut=300)
	public void ctest() {
		try {
		Thread.sleep(3000);}
		catch(Exception e) {}
		System.out.println("Test1 executed .....");
	}
	
	@Test(priority=2,groups={"Regression"})	
	@Parameters({"user","pwd"})
	public void btest(String user,String pwd) {
		System.out.println("Test2 executed ....."+ user + pwd);
		
	}
	
	@Test(groups={"smoke"} ,priority=3)
	public void atest() {
		System.out.println("Test3	smoke  executed .....");

}
}
