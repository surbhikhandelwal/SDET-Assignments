package com.base.pageModules;

import com.base.webActionHelperUtils.WebActionsHelperUtils;
import com.page.locatorModules.EditPageLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class EditApp extends WebActionsHelperUtils implements EditPageLocator {

    public EditApp(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickElement() {
        waitForElementToBeClickAble(START_BUTTON, 10);
        safeClick(START_BUTTON);
    }

    public void createPage() {
        waitForElementToBeClickAble(NEW_PAGE, 10);
        safeClick(NEW_PAGE);
    }

    public void testName() {
        waitForElementToBeClickAble(INPUT, 10);
        // safeClick(INPUT);
        enterTextIntoElement(INPUT, "Test");
        safeClick(CREATE);
    }

    public void createApp() throws InterruptedException{
        waitForElementToBeClickAble(MESSAGING, 10);
        safeClick(MESSAGING);
        waitForElementToBeClickAble(SMS, 10);
        jsxClick(SMS);
        waitForElementToBeClickAble(TARGET, 10);
        WebElement source = driver.findElement(SOURCE);
        WebElement target = driver.findElement(TARGET);
        dragDrop(source, target);
        enterTextIntoElement(PHONE, "1234567890");
        enterTextIntoElement(MSG, "Hello World");
        jsxClick(EMAIL);
        jsxClick(EMAIL_PANEL);
        WebElement dragEmailPanel = driver.findElement(EMAIL_PANEL);
        dragElement(dragEmailPanel, 300, 150);
        WebElement source2 = driver.findElement(SMS_NOT_SENT);
        WebElement target2 = driver.findElement(EMAIL_DROP);
        dragDrop(source2, target2);
        enterTextIntoElement(SMTP, "smtp.gmail.com");
        enterTextIntoElement(PORT, "465");
        enterTextIntoElement(USERNAME,"abc@gmail.com");
        enterTextIntoElement(PASSWORD, "12345");
        enterTextIntoElement(FROM_NAME, "abc@gmail.com");
        enterTextIntoElement(TO_NAME,"xyz@gmail.com");
        enterTextIntoElement(SUBJECT,"SMS not sent");
        enterTextIntoElement(EMAIL_MESSAGE,"SMS to phone num 1234567890 not sent");
        safeClick(BASIC_TAB);
        jsxClick(EXIT_BUTTON);
        Thread.sleep(2000);
        WebElement source3 = driver.findElement(SMS_SENT);
        WebElement target3 = driver.findElement(EXIT1);
        dragDrop(source3, target3);
        jsxClick(EXIT_BUTTON);
        Thread.sleep(2000);
        WebElement dragExit2 =driver.findElement(DRAG_EXIT2);
        WebElement emailSent = driver.findElement(EMAIL_SENT);
        dragElement(dragExit2, 240, 150);
        Thread.sleep(2000);
        WebElement exit2 = driver.findElement(EXIT2);
        dragDrop(emailSent, exit2);
        jsxClick(EXIT_BUTTON);
        Thread.sleep(2000);
        WebElement exit3 =driver.findElement(EXIT3);
        WebElement dragExit3 =driver.findElement(DRAG_EXIT3);
        dragElement(exit3, 400, 150);
        WebElement emailNotSent = driver.findElement(EMAIl_NOT_SENT);
        dragDrop(emailNotSent, exit3 );
        Thread.sleep(5000);
    }


    public void genericWait(int timeOuts) {
        implicitlyWait(timeOuts);
    }
}
