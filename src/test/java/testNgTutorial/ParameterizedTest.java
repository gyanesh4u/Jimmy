package testNgTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizedTest {

	@Test
	@Parameters("browser")
	public void paramerizedTest(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://google.com");
			driver.quit();
		}
		else if(browser.equals("safari")) {
			WebDriverManager.safaridriver().setup();
			WebDriver driver=new SafariDriver();
			driver.get("https://google.com");
			driver.quit();
		}
	}
}
