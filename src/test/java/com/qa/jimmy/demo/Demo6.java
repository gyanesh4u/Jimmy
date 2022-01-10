package com.qa.jimmy.demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo6 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();
		String mainWindow = driver.getWindowHandle();
		System.out.println("Main window handle is "+mainWindow);
		Set<String> s1 = driver.getWindowHandles();
		System.out.println("Child window handle is "+s1);
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()) {
			String childWindow=i1.next();
			if(!mainWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				//WebElement text = driver.findElement(By.id("sampleHeading"));
				//System.out.println("Heading of child window is"+text.getText());
				driver.close();
				System.out.println("Child window closed");
			}
		}
		driver.switchTo().window(mainWindow);
		driver.quit();
	}
}
