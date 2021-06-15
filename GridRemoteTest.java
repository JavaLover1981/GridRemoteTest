package com.php.tests;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class GridRemoteTest {
	final static Logger logger = Logger.getLogger(GridRemoteTest.class);

	WebDriver driver;
	String pageUrl = "https://www.costco.com/";
	// --> /wd/hub make the url remote
	String HubUrl = "http://10.0.0.57:4444/wd/hub";
	// If you cannot generate IP address then use below:
	// "http://localhost:4444/wd/hub";

	@Test
	public void costcoSearchRemoteTest() {
		try {
			DesiredCapabilities dCap = new DesiredCapabilities();
			ChromeOptions chOpt = new ChromeOptions();
			// chOpt.addArguments("--Headless");
			chOpt.setHeadless(true);
			chOpt.merge(dCap);
			// Launching the remote browser
			driver = new RemoteWebDriver(new URL(HubUrl), chOpt);
			driver.get(pageUrl);
			logger.info("Title is: " + driver.getTitle());
			Thread.sleep(3000);
			
			driver.close();
			driver.quit();

		} catch (Exception e) {

		}

	}
}
