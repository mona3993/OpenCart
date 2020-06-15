package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitiateBrowser {

    public static WebDriver driver = null;


    public static WebDriver openBrowser(){
        //initiate chrome browser
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

        driver = new ChromeDriver();
        return driver;

    }
}
