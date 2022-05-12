package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel_Reservation {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prabhuraj\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://adactinhotelapp.com/");
	
	    driver.manage().window().maximize();
	    
	    WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("AatishPrabhu");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123456");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(7);
		
		Thread.sleep(5000);
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByIndex(3);
		
		Thread.sleep(5000);
		WebElement room = driver.findElement(By.id("room_type"));
		Select s3 = new Select(room);
		s3.selectByIndex(2);
		
		Thread.sleep(5000);
		WebElement roomNo = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(roomNo);
		s4.selectByIndex(7);
		
		Thread.sleep(5000);
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(adultRoom);
		s5.selectByIndex(3);
		
		Thread.sleep(5000);
		WebElement childRoom = driver.findElement(By.id("child_room"));
		Select s6 = new Select(childRoom);
		s6.selectByValue("2");
		
		WebElement submit = driver.findElement(By.id("Submit"));
        submit.click();
        
        WebElement select = driver.findElement(By.id("radiobutton_0"));
        select.click();
        
        WebElement cont = driver.findElement(By.id("continue"));
        cont.click();
        
        WebElement name1 = driver.findElement(By.id("first_name"));
        name1.sendKeys("Srimathy");
        
        WebElement name2 = driver.findElement(By.id("last_name"));
        name2.sendKeys("Prabhuraj");
        
        WebElement add = driver.findElement(By.id("address"));
        add.sendKeys("Thoraipakkam,Chennai");
        
        WebElement cardNo = driver.findElement(By.id("cc_num"));
        cardNo.sendKeys("1234567890");
        
        Thread.sleep(3000);
        WebElement type = driver.findElement(By.id("cc_type"));
        Select s11 = new Select(type);
        s11.selectByIndex(2);
        
        Thread.sleep(3000);
        WebElement month = driver.findElement(By.id("cc_exp_month"));
        Select s12 = new Select(month);
        s12.selectByIndex(10);
        
        Thread.sleep(3000);
        WebElement year = driver.findElement(By.id("cc_exp_year"));
        Select s13 = new Select(year);
        s13.selectByIndex(8);
        
        WebElement cvv = driver.findElement(By.id("cc_cvv"));
        cvv.sendKeys("321");
        
        Thread.sleep(3000);
        WebElement bookNow = driver.findElement(By.id("book_now"));
        bookNow.click();
        
        WebElement logout = driver.findElement(By.xpath("//a[text() = 'Logout']"));
        logout.click();
	}

}
