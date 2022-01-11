package com.qa.jimmy.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo9 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
	}
}
