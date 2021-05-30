package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenerclass.class)
public class listenerTest {
	@Test
	public void test1() {
		System.out.println("Test1 executed ....."+Thread.currentThread().getId());
	}
	
	@Test
	public void test2() {
		System.out.println("Test2 executed ....."+Thread.currentThread().getId());
	}
	
	@Test
	public void test3() {
		System.out.println("Test3	 executed ....."+Thread.currentThread().getId());
	}
}
