package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
	@Test(retryAnalyzer=listeners.Retryanalyser.class)
	public void test1() {
		Assert.assertEquals(false, true);
	}
}
