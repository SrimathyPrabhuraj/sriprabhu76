package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {

	public static void main(String[] args) throws InterruptedException {

// property setting - (key , value )
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prabhuraj\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
// browser launch 
WebDriver driver = new ChromeDriver();

//get - Url launch
driver.get("https://www.flipkart.com/");

// maximize
driver.manage().window().maximize();

// Navigation - to
driver.navigate().to("https://www.amazon.in/");

//back
driver.navigate().back(); // Flipkart

//getTitle
String title = driver.getTitle();
System.out.println("Title : " + title);

//forward
driver.navigate().forward(); // Amazon

//get current url
String currentUrl = driver.getCurrentUrl();
System.out.println("current Url :" + currentUrl);

Thread.sleep(2000);

// refresh
driver.navigate().refresh();

// close
driver.close();

	}

}
