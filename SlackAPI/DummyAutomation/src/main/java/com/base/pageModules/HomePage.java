package com.base.pageModules;

import com.base.webActionHelperUtils.WebActionsHelperUtils;
import com.page.locatorModules.HomePageLocators;
import org.openqa.selenium.WebDriver;

public class HomePage extends WebActionsHelperUtils implements HomePageLocators {


	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void clickElement() {
		waitForElementToBeClickAble(CREATE_APP, 10);
		safeClick(CREATE_APP);
	}

	public void navigatToUrl() {
		driver.get(url);
	}


	public void genericWait(int timeOuts) {
		implicitlyWait(timeOuts);
	}


}
