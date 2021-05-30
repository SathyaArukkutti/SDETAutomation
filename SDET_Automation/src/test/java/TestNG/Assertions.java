package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

	
		@Test
		public void hardassertion() {
			Assert.assertEquals(true, true);
			System.out.println("HA executed .....");
		}
		
		@Test
		public void softassertion() {
			SoftAssert obj= new SoftAssert();
			obj.assertEquals(true, false);
			obj.assertEquals(false, true);
			System.out.println("SA executed .....");
			obj.assertAll();
		}

	}


