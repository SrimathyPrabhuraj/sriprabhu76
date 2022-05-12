package com.selenium1;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Example {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Prabhuraj\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Frames.html");
	
	driver.manage().window().maximize();
	
	// single frame
	driver.switchTo().frame("SingleFrame");
	
	WebElement textBox1 = driver.findElement(By.xpath("//input[@type ='text']"));
	textBox1.sendKeys("Apple");
	
	// default content --> from frame to webpage
	driver.switchTo().defaultContent();
	
	// Multi frame
	WebElement iframebutton = driver.findElement(By.xpath("(//a[@class='analystic']) [2]"));
	iframebutton.click();
	
	// outer frame
	WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(outerframe);	
		
	WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));	
	driver.switchTo().frame(innerframe);
	
	WebElement textBox2 = driver.findElement(By.xpath("//input[@type='text']"));
	textBox2.sendKeys("Mango");
	
	// parent frame --> from inner to outer frame
	driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	
		
		
		
		
		
		
		
		
	}

}
