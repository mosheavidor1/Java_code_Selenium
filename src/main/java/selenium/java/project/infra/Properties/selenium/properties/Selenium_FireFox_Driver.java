package selenium.java.project.infra.Properties.selenium.properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_FireFox_Driver extends Browsers implements Browser_Properties {


    WebDriver driver;

    @Override
    public void Drivers() {
        System.setProperty(FF_Pro, FF_Path);


    }

    @Override
    public void Element() {

    }

    public WebDriver getDriver() {

        driver = new FirefoxDriver();
        return driver;
    }
}



