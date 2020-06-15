package pages;

import org.openqa.selenium.WebDriver;
import utils.InitiateBrowser;

public class OpenApplication {

    public static WebDriver driver = null;

    public static void openAplication() {
        driver = InitiateBrowser.openBrowser();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
    }
}
