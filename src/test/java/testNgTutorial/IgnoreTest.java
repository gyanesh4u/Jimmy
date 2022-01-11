package testNgTutorial;

import org.testng.annotations.Test;

public class IgnoreTest {

	@Test
	public void test1() {
		System.out.println("This is test 1");
	}
	
	@Test(enabled = true)
	public void test2() {
		System.out.println("This is test 2");
	}
}
