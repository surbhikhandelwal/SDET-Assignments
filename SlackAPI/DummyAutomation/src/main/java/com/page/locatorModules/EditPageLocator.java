package com.page.locatorModules;

import org.openqa.selenium.By;

public interface EditPageLocator {
    By START_BUTTON=By.xpath("//button[contains(@class,'ui-button')]");
    By NEW_PAGE=By.id("add-page");
    By INPUT = By.xpath("//form/p/input[contains(@class,'indented submitonenter')]");
    By CREATE = By.xpath("(//button[contains(text(),'Create')])[2]");
    By MESSAGING = By.xpath("//a[contains(text(), 'Messaging')]");
    By SMS=By.xpath("(//div[contains(@class,'ui-helper-reset')][4]//a)[3]/span");
    By SOURCE = By.xpath("(//div[contains(@class, 'mod-south')]/div)[2]");
    By TARGET = By.xpath("//div[contains(@class, 'mod-north')]/div");
    By PHONE = By.name("phone_constant");
    By MSG= By.name("message_phrase[]");
    By EMAIL=By.xpath("(//div[contains(@class,'ui-helper-reset')][4]//a)[2]/span");
    By EMAIL_PANEL=By.xpath("//div[@class='inner']//div[text()='Send an Email']");
    By SMS_NOT_SENT=By.xpath("(//div[@class='panel-nodes-attached inner']/div[contains(@class,'draggable')])[2]");
    By EMAIL_DROP=By.xpath("(//div[contains(@class,'mod-north')])[4]/div");
    By SMTP = By.name("smtp_url");
    By PORT = By.name("port");
    By USERNAME = By.name("username");
    By PASSWORD = By.name("password");
    By FROM_NAME = By.name("from_constant");
    By TO_NAME = By.name("to_constant");
    By SUBJECT = By.name("subject_constant");
    By CC_NAME =By.name("cc_constant");
    By EMAIL_MESSAGE = By.xpath("(//textarea[contains(@name, 'message_phrase[]')])[3]");
    By BASIC_TAB = By.xpath("//a[contains(text(),'Basic')]");
    By EXIT_BUTTON= By.xpath("(//div[contains(@class,'ui-helper-reset')][1]//a)[2]/span");
    By EXIT1=By.xpath("(//div[contains(@class,'mod-north')])[5]/div");
    By EXIT2 = By.xpath("(//div[contains(@class,'mod-north')])[6]/div");
    By EXIT3 = By.xpath("(//div[contains(@class,'mod-north')])[7]/div");
    By SMS_SENT = By.xpath("(//div[@class='panel-nodes-attached inner']/div[contains(@class,'draggable')])[1]");
    By EMAIL_SENT = By.xpath("(//div[@class='panel-nodes-attached inner']/div[contains(@class,'draggable')])[3]");
    By EMAIl_NOT_SENT = By.xpath("(//div[@class='panel-nodes-attached inner']/div[contains(@class,'draggable')])[4]");
    By DRAG_EXIT2= By.xpath("(//div[@class='inner']//div[text()='Exit App'])[2]");
    By DRAG_EXIT3= By.xpath("(//div[@class='inner']//div[text()='Exit App'])[3]");

}
