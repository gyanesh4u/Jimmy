package com.qa.jimmy.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo7 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(js.executeScript("return window.length").toString());
		System.out.println(numberOfFrames);
		List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
		System.out.println(iframe.size());
	}
}
