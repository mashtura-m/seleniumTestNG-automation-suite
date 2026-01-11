package com.mashtura.test.tests;

import com.mashtura.test.base.BaseTest;
import com.mashtura.test.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    WebDriver driver;
    private String email, password,testUrl;

    @Test
    public void testLogin() {
        // Add login test logic here.
        try {
            email = configReader.getValue("userEmail");
            password = configReader.getValue("userPassword");
            testUrl= configReader.getValue("testUrl");
            driver = getDriver();
            driver.get(testUrl);
            LoginPage loginPage = new LoginPage(driver, email, password);
            loginPage.doLogin("email","ID", "password","ID" ,"btn-primary","name");
            tearDown();
        } catch (Exception e) {
            tearDown();
            throw new RuntimeException(e);
        }
    }
}
///home/user/.m2/repository/org/aspectj/aspectjweaver/1.9.22.1/
