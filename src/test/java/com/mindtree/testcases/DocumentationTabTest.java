package com.mindtree.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.mindtree.base.TestBase;
import com.mindtree.objectRepository.PageObjRepository;


public class DocumentationTabTest extends TestBase {

	@Test
	public void ClickDocumentationTab() {
		log.debug("Inside DocumentationTabTest");
		PageObjRepository or = PageFactory.initElements(driver, PageObjRepository.class);
		or.clickDocTab();
		or.searchTextBox();
		or.secondSelect();
		Assert.assertEquals(driver.getTitle(), "Grid 3 :: Documentation for Selenium");
		log.debug("DocumentationTabTest completed");
		Reporter.log("DocumentationTabTest completed");

	}

}
