package ParallelExecution;

import org.testng.annotations.Test;

public class Parallel2 {
	@Test
	public void test4() {
		System.out.println("Test4 executed ....."+Thread.currentThread().getId());
	}
	
	@Test
	public void test5() {
		System.out.println("Test5 executed ....."+Thread.currentThread().getId());
	}
	
	@Test
	public void test6() {
		System.out.println("Test6	 executed ....."+Thread.currentThread().getId());
	}
}
