package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class ScrollDownPage {

    public static WebDriver driver = InitiateBrowser.driver;

    public static void scrollDown(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public static void ScrollTillElementDisplayed(By element){
//        WebElement ele = driver.findElement(element);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(ele);
//        actions.perform();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    }
}
