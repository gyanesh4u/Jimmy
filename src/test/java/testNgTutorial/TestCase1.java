package testNgTutorial;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test(groups = {"smokeTest","functionalTest"})
	public void loginTest() {
		System.out.println("Logged in successfully");
	}
}
