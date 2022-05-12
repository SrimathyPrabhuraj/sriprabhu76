package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prabhuraj\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.facebook.com/");
	
	    driver.manage().window().maximize();
	    
	    // Sendkeys
	    WebElement emailId = driver.findElement(By.id("email"));
	    emailId.sendKeys("sriprabhu76@gmail.com");
	    
	    // getAttribute
	    String attribute = emailId.getAttribute("name");
	    System.out.println(attribute);
	    
	    String attribute2 = emailId.getAttribute("value");
	    System.out.println(attribute2);
	    
	    // isDisplayed
	    boolean displayed = emailId.isDisplayed();
	    System.out.println("Is Displayed:"+ displayed);
	    
	    // clear
	    //emailId.clear();
	    
	    // Sendkeys
	    WebElement password = driver.findElement(By.name("pass"));
	    password.sendKeys("aatish08");
	    
	    //isEnabled
	    boolean enabled = password.isEnabled();
	    System.out.println("Is Enabled:"+ enabled);
	    
	    // click
	    WebElement login = driver.findElement(By.name("login"));

	    
	    //isSelected
	    boolean selected = login.isSelected();
	    System.out.println("Is Selected:"+ selected);
	    
	    login.click();
	}

}
