package com.demo.testS;

import com.base.commonUtils.BaseSetUp;
import com.base.pageModules.EditApp;
import com.base.pageModules.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest extends BaseSetUp {

	HomePage homePage;
	EditApp editPage;

	@BeforeMethod
	public void setUpTest() {
		setDriver();
		homePage = new HomePage(driver);
		editPage = new EditApp(driver);
		homePage.navigatToUrl();
	}

	@Test
	public void createApp() throws InterruptedException{
		homePage.clickElement();
		editPage.clickElement();
		editPage.createPage();
		editPage.testName();
		editPage.createApp();

	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}