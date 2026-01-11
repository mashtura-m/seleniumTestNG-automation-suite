package com.mashtura.test.base;

import com.mashtura.test.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    // Common setup and teardown for tests
    WebDriver driver;
    protected ConfigReader configReader;
    WebDriverManagerUtil webDriverManagerUtil;
    public BaseTest()  {
       configReader=new ConfigReader();
        try {
            webDriverManagerUtil=new WebDriverManagerUtil(configReader.getValue("driverPath"));
            driver= webDriverManagerUtil.doDriverSetUp();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    protected WebDriver getDriver(){
        return driver;
    }
    protected ConfigReader getConfigFile(){
        return configReader;
    }
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
