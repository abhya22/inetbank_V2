package com.inetbanking.BaseClass;

import java.time.Duration;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.inetbanking.Utilities.ReadConfiguration;

public class BaseClass {
	
	ReadConfiguration readConfiguration = new ReadConfiguration();
	public String BaseURL = readConfiguration.getApplicationURL();
	public String Username = readConfiguration.getUserName();
	public String Password = readConfiguration.getPassword();
	public static WebDriver driver;
	public static Logger Logger;
	
	//@BeforeClass
	@SuppressWarnings("static-access")
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", readConfiguration.getChromeBrower());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		
		Logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
		
	}

	//@AfterClass
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
}
