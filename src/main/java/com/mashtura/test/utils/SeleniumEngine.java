package com.mashtura.test.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumEngine {

    public WebElement findElementByLocator(WebDriver driver,String locator, String locatorType) {
        WebElement element = null;
        switch (locatorType.toLowerCase()) {
            case "id":
                element = driver.findElement(By.id(locator));
                break;
            case "xpath":
                element = driver.findElement(By.xpath(locator));
                break;
            case "name":
                element = driver.findElement(By.className(locator));
                break;
            case "css":
                element = driver.findElement(By.cssSelector(locator));
                break;
            default:
                throw new IllegalArgumentException("Invalid locator type: " + locatorType);
        }
        return element;
    }
}
