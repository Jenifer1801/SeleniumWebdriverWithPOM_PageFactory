package com.mindtree.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.mindtree.base.TestBase;
import com.mindtree.objectRepository.PageObjRepository;

public class DownloadTabTest extends TestBase {

	@Test
	public void dwnloadTab() {
		log.debug("Inside DownloadTabTest");

		PageObjRepository or = PageFactory.initElements(driver, PageObjRepository.class);
		or.clickDownloadTab();
		Assert.assertEquals(driver.getTitle(), "Downloads");

		log.debug("DownloadTabTest completed");

	}

}
