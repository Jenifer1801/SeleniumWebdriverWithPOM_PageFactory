package com.mindtree.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	/*
	 * WebDriver Properties Logs ExtentReports DB Excel Mail
	 */
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");

	@BeforeSuite
	public void setUp() {
		if (driver == null) {

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");

			} catch (FileNotFoundException e) {

				e.printStackTrace();

			}
			try {
				config.load(fis);
				log.debug("Config file loaded!!");
			} catch (IOException e1) {

				e1.printStackTrace();
			}
			

			if (config.getProperty("browser").equals("firefox")) {

				WebDriverManager.firefoxdriver().setup();
				driver = new ChromeDriver();
				log.debug("Firefox browser launched!!");

			} else if (config.getProperty("browser").equals("chrome")) {
				

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				log.debug("Chrome browser launched!!");
			} else if (config.getProperty("browser").equals("IE")) {

				WebDriverManager.iedriver().setup();
				driver = new ChromeDriver();
				log.debug("IE browser launched!!");
			}
			driver.get(config.getProperty("testurlsite"));
			log.debug("	User navigated to https://www.selenium.dev/ site ");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
					TimeUnit.SECONDS);

		}

	}

	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {

		}
		return false;
	}

	@AfterSuite
	public void tearDown() {
		if (driver != null) {
			driver.quit();

		}

		log.debug("Test execution completed sucessfully!!!");

	}

}
