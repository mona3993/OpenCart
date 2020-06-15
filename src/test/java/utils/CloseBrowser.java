package utils;

import org.openqa.selenium.WebDriver;

public class CloseBrowser {

    public static WebDriver driver = InitiateBrowser.driver;

    public static void endBrowserSession(){
        driver.quit();
    }
}
