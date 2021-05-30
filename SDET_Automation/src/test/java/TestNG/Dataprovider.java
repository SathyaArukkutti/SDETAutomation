package TestNG;


public class Dataprovider {
	@org.testng.annotations.DataProvider
	public static Object[][] dp1() {
		return new Object[][] {new Object[] {1,"User1"}, new Object[] {2,"User2"},
			new Object[] {3,"User3"},};
		}
}
