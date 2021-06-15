package com.php.tests;
//package com.php.project.tests;
//
//import java.time.Duration;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//@Test
//public class BrokenLinks{
//	try{
//		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver", "src/test/resources/browserDrivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("https://www.costco.com/");
////		driver.navigate().back();
////		driver.get("http://newtours.demoaut.com");
//		
//		List<WebElement> links = driver.findElements(By.linkText("a"));
//		int numOfLinks = links.size();
//		System.out.println("Total links: " + numOfLinks);
//		
//		int i = 1;
//		for (WebElement link : links) {
//			String linkTxt = link.getText();
//			System.out.println(i + ")link text is: [" + linkTxt + "]");
//			i++;
//		}
//
//		
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//}
//}