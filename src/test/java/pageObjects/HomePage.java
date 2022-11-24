package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public static final String URL = "https://blazedemo.com/";

    private static final By DEPARTURE_CITY = By.xpath("//select[@name='fromPort']");
    private static final By DESTINATION_CITY = By.xpath("//select[@name='toPort']");
    public static final By FORM_SUBMIT_BUTTON = By.xpath("//input[@value='Find Flights']");
    public static void goTo() {
        driver.get(URL);
    }

    public static void findFlights() {
        waitAndClick(FORM_SUBMIT_BUTTON);
    }

    public static void chooseDepartureCity(String city) {
        findSelectAndSelectByValue(DEPARTURE_CITY, city);
    }

    public static void chooseDestinationCity(String city) {
        findSelectAndSelectByValue(DESTINATION_CITY, city);
    }
}
