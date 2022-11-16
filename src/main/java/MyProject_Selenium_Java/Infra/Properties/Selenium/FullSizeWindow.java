package MyProject_Selenium_Java.Infra.Properties.Selenium;

import org.openqa.selenium.WebDriver;

public class FullSizeWindow {

    WebDriver driver;

    public void Full_Size(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();

    }

}
