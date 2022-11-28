package StepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.text.CaseUtils;
import pageObjects.FlightJourney;
import pageObjects.HomePage;
import pageObjects.PurchasePage;
import pageObjects.Users;

import java.util.Map;

public class ChooseFlightStepDef extends BaseSteps{
    private String departureCity;
    private String destinationCity;
    private Users listOfUsers = new Users();

    @Given("I am on the homepage")
    public void homepage() {
        HomePage.goTo();
    }

    @And("I choose flight path from {string} to {string}")
    public void departureCityToDestinationCity(String departure, String destination) {
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

    @Then("I see the flight path from {string} to {string}")
    public void iSeeTheFlightPathFromTo(String depCity, String destCity) {
        FlightJourney.verifyCorrectFlight(depCity, destCity);
    }

    @Given("I have the following details")
    public void iHaveTheFollowingDetails(DataTable table) {
        Map<String, String> userInformation = table.asMap(String.class, String.class);

        for (Map.Entry<String, String> entry : userInformation.entrySet()) {
            String currentId;
            String currentInformation = userInformation.get(entry.getKey());

            if ((entry.getKey()).equals("Name")) {
                currentId = "inputName";
            } else {
                currentId = CaseUtils.toCamelCase(entry.getKey(), false);
            }

            PurchasePage.inputUserInformation(currentId, currentInformation);
        }
    }
}
