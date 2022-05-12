package com.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyn_Webtable {
	static int indexOfTotal, indexOfRecovered , indexOfActive;
	static String country;
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Prabhuraj\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.worldometers.info/coronavirus/");
		
		//driver.manage().window().maximize();
		
		// Iterate all headers
		List<WebElement> allHeaders = driver.findElements(By.tagName("th"));

		for (int i = 0; i < allHeaders.size(); i++) {
			
			String text = allHeaders.get(i).getText();
			System.out.println(text);
			
			String headers = text.replaceAll("\n", " ");
			System.out.println(headers);
			
			if (headers.equalsIgnoreCase("Total cases")) {
				
				indexOfTotal = i;
			System.out.println("indexOfTotal:" + indexOfTotal);
			}
			
			else if (headers.equalsIgnoreCase("Total Recovered")) {
				indexOfRecovered = i ;
				System.out.println("Index of Recovered :" + indexOfRecovered);	
			}
			else if (headers.equalsIgnoreCase("Active cases")) {
			  indexOfActive = i;
			  System.out.println("Index of Active:" + indexOfActive);
			}
		}
		
		// traverse into body
		
		List<WebElement> allrows = driver.findElements(By.xpath("//table/tbody[1]/tr"));
		
		for (int i = 0; i < allrows.size(); i++) {
		List<WebElement> allData = allrows.get(i).findElements(By.tagName("td"));
		
		for (int j = 0; j < allData.size(); j++) {
		
			if (allData.get(j).getText().equalsIgnoreCase(country)) {
			
				System.out.println("Total cases:"+ allData.get(indexOfTotal).getText());
				System.out.println("Recovered cases:"+ allData.get(indexOfRecovered).getText());
				System.out.println("Active cases:" + allData.get(indexOfActive).getText());
			}
			
		}
		}
	}

}
