package TestNG;

import org.testng.annotations.Test;

public class DataproviderClass {
	@org.testng.annotations.DataProvider
	public Object[][] dp() {
		return new Object[][] {new Object[] {1,"User4"}, new Object[] {2,"User5"},
			new Object[] {3,"Use6"},};
		}
	
	
	@Test(dataProvider="dp")
	public void test2(Integer n, String str) {
		System.out.println(n +"............"+ str);
	}

	@Test(dataProvider="dp1", dataProviderClass= Dataprovider.class)
	public void test3(Integer n, String str) {
		System.out.println(n +"............"+ str);
	}
}
