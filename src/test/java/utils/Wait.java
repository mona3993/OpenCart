package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Wait {

    public static WebDriver driver = InitiateBrowser.driver;
    public static WebDriverWait wait = new WebDriverWait(driver,30);

    public static void waitTillElementIsVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void waitTillElementIsVisible(By element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void waitTillElementIsClickable(By element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForPageLoad(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
