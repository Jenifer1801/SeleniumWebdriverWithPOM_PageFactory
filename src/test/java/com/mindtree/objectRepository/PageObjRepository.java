package com.mindtree.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.mindtree.base.TestBase;

public class PageObjRepository extends TestBase {

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar\"]/a[1]")
	WebElement dwnloadTab;

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar\"]/div[1]/span")
	WebElement aboutTab;

	@FindBy(how = How.XPATH, using = "//*[@id=\"aboutSubnav\"]/div[2]/a")
	WebElement governanceTab;

	@FindBy(how = How.XPATH, using = "//body/div[3]/div[1]/div[1]/a[1]/div[1]")
	WebElement learnMoreBtn;

	@FindBy(how = How.XPATH, using = "//header/nav[@id='navbar']/a[3]")
	WebElement docTab;

	@FindBy(how = How.XPATH, using = "//input[@id='search-by']")
	WebElement searchTextBox;

	@FindBy(how = How.XPATH, using = "//body/div[2]/div[2]")
	WebElement secondSelect;

	public void clickDownloadTab() {
		dwnloadTab.click();
	}

	public void clickAboutTab() {
		aboutTab.click();
	}

	public void clickGovernanceTab() {
		governanceTab.click();
	}

	public void clickLearnMoreBtn() {
		learnMoreBtn.click();
	}

	public void clickDocTab() {
		docTab.click();
	}

	public void searchTextBox() {
		searchTextBox.sendKeys("Grid");
	}

	public void secondSelect() {
		secondSelect.click();
	}

}
