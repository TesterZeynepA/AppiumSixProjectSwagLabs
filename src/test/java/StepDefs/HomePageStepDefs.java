package StepDefs;

import Pages.HomePage;
import Utils.DriverFactory;
import io.cucumber.java.en.Then;

public class HomePageStepDefs {

    HomePage hp = new HomePage(DriverFactory.getDriver());

    @Then("should see Home Page")
    public void shouldSeeHomePage() {
        hp.checkHomePage();
    }
}
