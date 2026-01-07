package com.mashtura.tests.pages;

import com.mashtura.tests.base.SeleniumEngine;
import com.mashtura.tests.base.WebDriverManagerUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static String email = null;
    private static String password = null;

    WebDriver driver;
    public LoginPage(WebDriver driver, String email, String password) {
        LoginPage.email = email;
        LoginPage.password = password;
        this.driver=driver;
    }
    public void doLogin(String emailLocator, String emailType,String passLocator,String passType,String loginBtnLocator,String loginBtnType){
        SeleniumEngine engine=new SeleniumEngine();
        WebElement emailElement = engine.findElementByLocator(driver,emailLocator, emailType);
        emailElement.sendKeys(email);

        // Find and send keys to password field
        WebElement passElement = engine.findElementByLocator(driver,passLocator, passType);
        passElement.sendKeys(password);

        // Find and click the login button
        WebElement loginBtnElement = engine.findElementByLocator(driver,loginBtnLocator, loginBtnType);
        loginBtnElement.click();
    }


}
