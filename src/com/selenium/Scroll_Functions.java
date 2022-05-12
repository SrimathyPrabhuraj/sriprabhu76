package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Functions {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Prabhuraj\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();

		WebElement Cart = driver.findElement(By.xpath("//span[text() = 'Cart']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver; // narrowing
		
		js.executeScript("arguments[0].scrollIntroView();",Cart);
		
		Thread.sleep(2000);
		
		// scroll up
		js.executeScript("window.scrollBy(0, -4000);");
	}

}
