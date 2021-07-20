package com.BASE;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory extends BasePage {


public WebDriver driver;





    public void getBrowser() {
        String browser=prop.getProperty("browser");
        if(browser.equals("chrome") || browser.isEmpty()) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions=new ChromeOptions();
            chromeOptions.addArguments("start-maximized");
            driver=new ChromeDriver(chromeOptions);
        }
        else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
            driver.manage().window().setSize(new Dimension(1920, 1080));
        }

    }

    public WebDriver getEnvironment() {

        String Environment=prop.getProperty("environment");
        if(Environment.equals(Env)) {
            driver.get(Env);
        }
        else
            throw new RuntimeException("No other environment");
        PageInitializer.initialize();

        return driver;
    }


}
