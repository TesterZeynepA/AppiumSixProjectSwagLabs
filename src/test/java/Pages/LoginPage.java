package Pages;

import Utils.ReusableMethods;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage {
    AndroidDriver driver;
    ReusableMethods methods;

    public LoginPage(AndroidDriver androidDriver) {
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By swagLogo = By.xpath("(//android.view.ViewGroup/android.widget.ImageView)[1]");
    By icon = By.xpath("(//android.view.ViewGroup/android.widget.ImageView)[2]");
    By usernameBox = By.xpath("//android.widget.EditText[@text='Username']");
    By passwordBox = By.xpath("//android.widget.EditText[@text='Password']");
    By loginButton = By.xpath("//android.widget.TextView[@text='LOGIN']");
    By errorMessageUsername = By.xpath("//android.widget.TextView[@text='Username is required']");
    By errorMessagePassword = By.xpath("//android.widget.TextView[@text='Password is required']");
    By errorMessageGenel = By.xpath("//android.widget.TextView[@text='Username and password do not match any user in this service.']");

    public void checkLoginPage(){
        methods.checkElement(swagLogo);
    }

    public void checkIcon(){
        methods.checkElement(icon);
    }
    public void checkLogo(){
        methods.checkElement(swagLogo);
    }

    public void checkUsernameBoxText(String expectedText){
        Assert.assertEquals(methods.getText(usernameBox), expectedText);
    }

    public void checkPasswordBoxText(String expectedText){
        Assert.assertEquals(methods.getText(passwordBox), expectedText);
    }

    public void checkLoginButtonText(String expectedText){
        driver.findElement(loginButton).getText();
        Assert.assertEquals(methods.getText(loginButton), expectedText);
    }

    public void checkErrorMessageUsername(String expectedText){
        Assert.assertEquals(methods.getText(errorMessageUsername), expectedText);
    }

    public void inputUsername(String expectedText){
        methods.sendKeys(usernameBox, expectedText);
        methods.click(passwordBox);
    }

    public void checkErrorMessagePassword(String expectedText){
        Assert.assertEquals(methods.getText(errorMessagePassword), expectedText);
    }

    public void inputPassword(String expectedText){
        methods.sendKeys(passwordBox, expectedText);
    }

    public void clickLoginButton(){
        methods.click(loginButton);
    }

    public void checkErrorMessageGenel(String expectedText){
        Assert.assertEquals(methods.getText(errorMessageGenel), expectedText);
    }
}
