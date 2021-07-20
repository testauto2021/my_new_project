package com.BASE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends ConfigFileReader {

protected WebDriver driver;
private static WebDriverWait wait;
private static Actions action;





























    public <PFPage extends BasePage> PFPage InstanceOf(Class<PFPage> pageInstance) {
        try {
            return PageFactory.initElements(driver, pageInstance);
        }
        catch(Exception e) {
            throw new RuntimeException("Error while creating a new page instance", e);
        }
    }
}
