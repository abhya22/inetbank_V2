package com.inetbanking.BaseClass;

import java.time.Duration;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.inetbanking.Utilities.ReadConfiguration;
import com.inetbanking.Utilities.ScreenShots;

public class BaseClass {

	ReadConfiguration readConfiguration = new ReadConfiguration();
	public String BaseURL = readConfiguration.getApplicationURL();
	public String Username = readConfiguration.getUserName();
	public String Password = readConfiguration.getPassword();
	public static WebDriver driver;
	public static Logger Logger;

	// @BeforeClass
	@SuppressWarnings("static-access")
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", readConfiguration.getChromeBrower());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		Logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");

	}

	// @AfterClass
	@AfterMethod
//	public void Teardown(ITestResult result) throws InterruptedException {
//		if(ITestResult.FAILURE==result.getStatus()) {
//			ScreenShots SS = new ScreenShots();
//			SS.CaptureScreenshots(result.getName());
//		}
//		Thread.sleep(3000);
//		driver.quit();
//	}
	public void Teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}

