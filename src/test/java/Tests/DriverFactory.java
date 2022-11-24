package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    static {
        WebDriverManager.chromedriver().setup();
    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            setDriver();
        }
        return driver;
    }

    private static void setDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized", "incognito");
//        options.addArguments("headless");
        driver = new ChromeDriver(options);
    }

    public static void tearDownDriver() {
        if(driver != null) {
            driver.close();
        }
    }
}
