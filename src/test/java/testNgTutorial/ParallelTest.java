package testNgTutorial;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
WebDriver driver;
	@Test
	public void getChrome() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
	}
	@Test
	public void getSafari() {
		WebDriverManager.safaridriver().setup();
		driver=new SafariDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}
}
