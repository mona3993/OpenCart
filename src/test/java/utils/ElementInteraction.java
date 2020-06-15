package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementInteraction {
    public static WebDriver driver = InitiateBrowser.driver;

    public static boolean isElementPresent(By locatorKey) {
        try {
            driver.findElement(locatorKey);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

}
