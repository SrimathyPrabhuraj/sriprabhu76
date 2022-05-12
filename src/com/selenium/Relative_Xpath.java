package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prabhuraj\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	    driver.manage().window().maximize();
	    
	    WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
	    email.sendKeys("abc@gmail.com");
	    
	    WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	    password.sendKeys("123");
	    
	    WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
	    login.click();
	}

}
