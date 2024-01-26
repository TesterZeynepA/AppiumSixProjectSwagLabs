package Pages;

import Utils.ReusableMethods;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage {
    AndroidDriver driver;
    ReusableMethods methods;

    public HomePage(AndroidDriver androidDriver) {
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By productsText = By.xpath("//android.widget.TextView[@text='PRODUCTS']");

    public void checkHomePage(){

        methods.checkElement(productsText);
    }
}
