package com.PAGES;

import com.BASE.BasePage;
import com.BASE.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public BasePage basepage;

    WebDriver driver;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "")
    public WebElement signinbttn1;

    @FindBy(how = How.ID, using = "")
    public WebElement username;

    @FindBy(how = How.ID, using = "")
    public WebElement password;

    @FindBy(how = How.ID, using = "")
    public WebElement signinbttn2;


    public void goToUrl() {


        driver.get(prop.getProperty("url"));
     // driver.get(ConfigFileReader.url);


    }

    public void clickSigninbttn1() {
        //clickElement(signinbttn1);
        signinbttn1.click();


    }

    public void enterUserName() {
        username.sendKeys("username");

    }

    public void enterPassword() {
        username.sendKeys("");

    }

    public void clickSigninbttn2() {
        username.sendKeys("");

    }

    public void verifyLogin (){

    }

}
