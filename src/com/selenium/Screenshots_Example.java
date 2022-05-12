package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots_Example {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhuraj\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		
		// large interface
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		// TakesScreenshot ---> small Interface
		TakesScreenshot ts = (TakesScreenshot) driver; // narrowing type casting
		
		// getScreenshotAs ---> methods
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		// location
		File dest = new File("C:\\Users\\Prabhuraj\\eclipse-workspace\\Selenium1\\Screenshots\\flipkart.png");
		
		// copy the file
		FileUtils.copyFile(src, dest);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
