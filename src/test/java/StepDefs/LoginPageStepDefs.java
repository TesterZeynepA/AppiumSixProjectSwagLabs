package StepDefs;

import Pages.LoginPage;
import Utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefs {

    LoginPage gp = new LoginPage(DriverFactory.getDriver());

    @Given("user is on the Gender Page")
    public void userIsOnTheGenderPage() {
        gp.checkGenderPage();
    }

    @Then("should see Image on Gender Page")
    public void shouldSeeImageOnGenderPage() {
        gp.checkImage();
    }

    @Then("should see Close Button on Gender Page")
    public void shouldSeeCloseButtonOnGenderPage() {
        gp.checkCloseButton();
    }

    @Then("should see Erkek Button: {string} on Gender Page")
    public void shouldSeeErkekButtonOnGenderPage(String expectedText) {
        gp.checkErkekButtonText(expectedText);
    }

    @Then("should see Kadin Button: {string} on Gender Page")
    public void shouldSeeKadinButtonOnGenderPage(String expectedText) {
        gp.checkKadinButtonText(expectedText);
    }

    @Then("should see Text: {string} on Gender Page")
    public void shouldSeeTextOnGenderPage(String expectedText) {
        gp.checkText(expectedText);
    }

    @When("click Erkek Button on Gender Page")
    public void clickErkekButtonOnGenderPage() {
        gp.clickErkekButton();
    }

    @When("click Kadin Button on Gender Page")
    public void clickKadinButtonOnGenderPage() {
        gp.clickKadinButton();
    }

    @When("click Close Button on Gender Page")
    public void clickCloseButtonOnGenderPage() {
        gp.clickCloseButton();
    }
}
