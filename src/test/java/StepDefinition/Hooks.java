package StepDefinition;

import Tests.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void beforeScenario() {
        DriverFactory.getDriver();
        System.out.println("this is running before test");
    }

    @After
    public static void afterScenario() {
        System.out.println("this is running after test");
        DriverFactory.tearDownDriver();
    }

}
