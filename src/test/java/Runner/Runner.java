package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import pageObjects.UserInformation;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Resources/Features", glue = {"StepDefinition"},tags = "@paymentScenario")
public class Runner {
}
