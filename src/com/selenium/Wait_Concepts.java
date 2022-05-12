package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Concepts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Prabhuraj\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://en-gb.facebook.com/");
				
				driver.manage().window().maximize();
				
				// implicit wait
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
		
				WebElement email = driver.findElement(By.id("email"));
		        email.sendKeys("abc@gmail.com");
		        
		        WebElement password = driver.findElement(By.id("pass"));
		        
		        // explicit wait
		        WebDriverWait wait = new WebDriverWait(driver,20);
		        wait.until(ExpectedConditions.visibilityOf(password));
		        password.sendKeys("123");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
