package StepDefs;

import Pages.LoginPage;
import Utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefs {


    LoginPage lp = new LoginPage(DriverFactory.getDriver());

    @Given("user is on the Login Page")
    public void userIsOnTheLoginPage() {
        lp.checkLoginPage();
    }

    @Then("should see Icon on")
    public void shouldSeeIconOn() {
        lp.checkIcon();
    }

    @Then("should see Logo on")
    public void shouldSeeLogoOn() {
        lp.checkLogo();
    }

    @Then("should see UsernameBox: {string}")
    public void shouldSeeUsernameBox(String expectedText) {
        lp.checkUsernameBoxText(expectedText);
    }

    @Then("should see PasswordBox: {string}")
    public void shouldSeePasswordBox(String expectedText) {
        lp.checkPasswordBoxText(expectedText);
    }

    @Then("should see LoginButton: {string}")
    public void shouldSeeLoginButton(String expectedText) {
        lp.checkLoginButtonText(expectedText);
    }

    @Then("should see Username Error Message: {string}")
    public void shouldSeeUsernameErrorMessage(String expectedText) {
        lp.checkErrorMessageUsername(expectedText);
    }

    @When("sendkeys Username: {string}")
    public void sendkeysUsername(String expectedText) {
        lp.inputUsername(expectedText);
    }

    @When("sendkeys Password: {string}")
    public void sendkeysPassword(String expectedText) {
        lp.inputPassword(expectedText);
    }

    @When("click Login Button")
    public void clickLoginButton() {
        lp.clickLoginButton();
    }

    @Then("should see Error Message Genel: {string}")
    public void shouldSeeErrorMessageGenel(String expectedText) {
        lp.checkErrorMessageGenel(expectedText);
    }

    @Then("should see Password Error Message: {string}")
    public void shouldSeePasswordErrorMessage(String expectedText) {
        lp.checkErrorMessagePassword(expectedText);
    }
}
