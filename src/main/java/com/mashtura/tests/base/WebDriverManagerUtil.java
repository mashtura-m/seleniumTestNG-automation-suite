package com.mashtura.tests.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class WebDriverManagerUtil {
    // Utility for WebDriver setup
    String DRIVER_PATH;
    WebDriver driver;

    public WebDriverManagerUtil(String driverPath) {
        DRIVER_PATH=driverPath;
    }

    public WebDriverManagerUtil() {
    }

    public WebDriver doDriverSetUp() {
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);

        // Initialize Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Optional: Start browser maximized

        // Create a new instance of ChromeDriver
        driver = new ChromeDriver(options);

        // Set a global implicit wait (Optional - generally used with explicit waits for reliability)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        return driver;
    }
}
