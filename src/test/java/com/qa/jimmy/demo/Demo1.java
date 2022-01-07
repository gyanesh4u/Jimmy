package com.qa.jimmy.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Macbook");
		driver.findElement(By.xpath("//input[contains(@data-ved,'0ahUKEwiJz9Tl25f1AhWBr1YBHflWBqoQ4dUDCAs')]")).click();
		// driver.close();
	}
}
