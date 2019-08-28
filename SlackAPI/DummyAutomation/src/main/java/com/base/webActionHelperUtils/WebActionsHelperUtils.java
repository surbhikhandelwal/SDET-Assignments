package com.base.webActionHelperUtils;

import com.base.commonUtils.BaseSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebActionsHelperUtils extends BaseSetUp {

    protected WebDriver driver;

    public WebActionsHelperUtils(WebDriver driver) {

        this.driver = driver;
    }

    public void safeClick(By element) {

        waitForElementToBeClickAble(element, 30);
        driver.findElement(element).click();
    }

    public void jsxClick(By element) {

        waitForElementToBeClickAble(element, 30);
        WebElement ele = driver.findElement(element);
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("arguments[0].click();", ele);
    }


    public void waitForElementToBeClickAble(By element, int timeOutSeconds) {
        WebDriverWait waitForElement = new WebDriverWait(driver, timeOutSeconds);
        waitForElement.until(ExpectedConditions.elementToBeClickable(element));
    }


    public void enterTextIntoElement(By element, String textToBeEntered) {
        driver.findElement(element).sendKeys(textToBeEntered);
    }


    public void dragDrop(WebElement source, WebElement target) throws InterruptedException {
        Actions act = new Actions(driver);
        act.clickAndHold(source).moveToElement(target).release().build().perform();
    }

    public void dragElement(WebElement element, int x, int y) throws InterruptedException {

        Actions act = new Actions(driver);
        Thread.sleep(300);
        act.clickAndHold(element).moveByOffset(x, y).release(element).build().perform();
        Thread.sleep(100);
    }


    public void implicitlyWait(int timeOuts) {
        driver.manage().timeouts().implicitlyWait(timeOuts, TimeUnit.SECONDS);
    }

    public boolean isElementPresent(By element) {
        try {
            driver.findElement(element);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
