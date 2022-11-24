package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasePage extends BasePage {

    private static final By FLIGHT_SET_HEADER = By.xpath("//h2");
    public static void verifyCorrectFlightPath() {
        String journeySet = driver.findElement(FLIGHT_SET_HEADER).getText();
        Assert.assertEquals("Your flight from TLV to SFO has been reserved.", journeySet);
    }

}
