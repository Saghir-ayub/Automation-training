package StepDefinition;

import Tests.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.FlightJourney;
import pageObjects.HomePage;
import pageObjects.PurchasePage;

public class BaseSteps {
    private static final WebDriver driver = DriverFactory.getDriver();

    public BaseSteps() {
        PageFactory.initElements(driver, HomePage.class);
        PageFactory.initElements(driver, FlightJourney.class);
        PageFactory.initElements(driver, PurchasePage.class);
    }
}
