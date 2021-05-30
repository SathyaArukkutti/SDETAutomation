package ParallelExecution;

import org.testng.annotations.Test;

public class Parallel3 {
	@Test
	public void test7() {
		System.out.println("Test7 executed ....."+Thread.currentThread().getId());
	}
	
	@Test
	public void test8() {
		System.out.println("Test8 executed ....."+Thread.currentThread().getId());
	}
	
	@Test
	public void test9() {
		System.out.println("Test9	 executed ....."+Thread.currentThread().getId());
	}
}
