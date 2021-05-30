package listeners;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryanalyser implements IRetryAnalyzer {
	int count =0;
	int retry =4;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<retry) {
			count++;
			return true;}
		return false;
	}

}
