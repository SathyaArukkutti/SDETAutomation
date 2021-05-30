package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerclass implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("New Test Started "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Pass  "+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed : "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped "+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test failed with Success % "+result.getName());
		
	}

	public void onStart(ITestContext context) {
		System.out.println("On Start Method "+context.getStartDate());
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("On Finish Method: "+context.getStartDate());
		
	}

}
