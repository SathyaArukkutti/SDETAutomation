package listeners;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
@Listeners(listenerclass.class)
public class Successpercentage {
	@Test(successPercentage=40, invocationCount=5)
	public void test1() {
		int count =0;
		count++;
		
	
		
		
	}
	
	
}
