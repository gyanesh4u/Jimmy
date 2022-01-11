package testNgTutorial;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(testNgTutorial.ListenerTestNG.class)
public class ListenerTestngTest {
WebDriver driver;
	@Test(priority=1)
	public void testToPass() {
		System.out.println("This method to pass");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}
	@Test(priority = 2)
	public void testToSkip() {
		System.out.println("This method to skip");
		throw new SkipException("Skipping This Method");
	}
	
	@Test(priority = 3)
	public void testToFail() {
		driver.getTitle();
		System.out.println("This method to fail");
	}
}
