package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FlightJourney;
import pageObjects.HomePage;
import pageObjects.PurchasePage;

public class ChooseFlightStepDef extends BaseSteps{
    private String departureCity;
    private String destinationCity;

    @Given("I am on the homepage")
    public void homepage() {
        HomePage.goTo();
    }

    @And("I choose flight path from {string} to {string}")
    public void departureCityToDestinationCity(String departure, String destination) {
        this.departureCity = departure;
        this.destinationCity = destination;
        HomePage.chooseDepartureCity(departure);
        HomePage.chooseDestinationCity(destination);
    }

    @And("click search flights button")
    public void clickSearchFlights() {
        HomePage.findFlights();
    }

    @When("I choose flight number {string}")
    public void chooseFlightNumber(String flightNumber) {
        FlightJourney.selectByFlightNumber(flightNumber);
    }

    @Then("I see the correct airline is chosen")
    public void correctAirlineChosen() {
        PurchasePage.verifyCorrectFlightPath();
    }

    @Then("I see the correct flight path")
    public void iSeeTheCorrectFlightPath() {
        FlightJourney.verifyCorrectFlight(departureCity, destinationCity);
    }
}
