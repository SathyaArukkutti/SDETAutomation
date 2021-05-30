package ParallelExecution;

import org.testng.annotations.Test;

public class Parallel1 {
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
