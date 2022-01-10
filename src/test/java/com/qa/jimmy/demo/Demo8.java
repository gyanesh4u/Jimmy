package com.qa.jimmy.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo8 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> allTh = driver.findElements(By.xpath("//table[@id='customers']//tbody"));
		System.out.println(allTh.size());
		List<WebElement> allTr = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(allTr.size());
		for(WebElement tr:allTr) {
			String text = tr.getText();
			if(text.contains("gyanesh")) {
			System.out.println(text);
		}
		}
		driver.quit();
	}
}
