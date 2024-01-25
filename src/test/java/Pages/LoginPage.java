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


}
