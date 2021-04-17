package com.mindtree.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.mindtree.base.TestBase;
import com.mindtree.objectRepository.PageObjRepository;

public class AboutTabTest extends TestBase {

	@Test
	public void clickAboutTab() {

		log.debug("Inside DownloadTabTest");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		PageObjRepository or = PageFactory.initElements(driver, PageObjRepository.class);
		or.clickAboutTab();
		or.clickGovernanceTab();
		Assert.assertEquals(driver.getTitle(), "Selenium Project Structure & Governance");
		js.executeScript("window.scrollBy(0,1000)");
		or.clickLearnMoreBtn();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.selenium.dev/sponsors/");
		log.debug("AboutTabTest completed");
		Reporter.log("AboutTabTest completed");

	}

}