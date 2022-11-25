package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
//test entry

public class FlightJourney extends BasePage {
    public static final By HEADER = By.xpath("//h3");

    public static void verifyCorrectFlight(String departureCity, String destinationCity) {
        String currentRoute = driver.findElement(HEADER).getText();
        Assert.assertTrue(
                "departure expected to be: " + departureCity + " and destination expected to be: " + destinationCity,
                currentRoute.contains("Flights from " + departureCity + " to " + destinationCity));
    }

    public static void selectByFlightNumber(String flightNumber) {
        By flightButton = By.xpath("//td[text()='" + flightNumber + "']/preceding-sibling::td/input[@type='submit']");
        waitAndClick(flightButton);
    }
}
