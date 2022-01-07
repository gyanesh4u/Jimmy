package com.qa.jimmy.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		System.out.println(driver.getTitle());
		Actions actions =new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//b[.='Recruitment']"))).build().perform();
		driver.findElement(By.xpath("//a[.='Candidates']")).click();
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		driver.findElement(By.name("addCandidate[firstName]")).sendKeys("Gyanesh");
		driver.findElement(By.name("addCandidate[lastName]")).sendKeys("Kamal");
		driver.findElement(By.name("addCandidate[email]")).sendKeys("kamal.gyanesh8@gmail.com");
		WebElement listBox = driver.findElement(By.name("addCandidate[vacancy]"));
		Select select=new Select(listBox);
		select.selectByVisibleText("Senior QA Lead");
		driver.findElement(By.id("btnSave")).click();
	}
}
