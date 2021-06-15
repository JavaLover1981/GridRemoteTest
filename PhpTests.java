package com.php.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.php.libraries.MyPhpLibrary;

public class PhpTests {
	private WebDriver driver;
	final static Logger logger = Logger.getLogger(MyPhpLibrary.class);

	@Test
	public void homePage() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/browserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		logger.info("Windows will be maximize");
		
		  driver.get("https://www.phptravels.net/"); logger.info(driver.getTitle());
		  logger.info(driver.getCurrentUrl());
		  
		  logger.info(driver.getPageSource()); // gives the source of the last page
		  System.out.println();
		 
		try {
			Thread.sleep(1000);
		} catch (Exception e) { 
			logger.error("Error: ", e);
			assertTrue(false);
		}

		
		 //  Extract the browser application title 
		String webPageTitle = driver.getTitle(); 
		   logger.info("Current webPage title is: " + webPageTitle);
		  
		  // Verify or assert actual title with excepted title 
		   String expectedTitle = "PHPTRAVELS | Travel Technology Partner"; 
		   assertEquals(webPageTitle,expectedTitle);
		 
		driver.close(); // close current browser; close current window
		driver.quit(); // close all the browsers opened by selenium script; quit the driver
	}

}
