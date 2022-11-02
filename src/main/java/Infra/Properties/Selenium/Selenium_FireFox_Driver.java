package Infra.Properties.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_FireFox_Driver extends Browsers implements Browser_Properties {



    @Override
    public void Drivers() {
        System.setProperty(FF_Pro, FF_Path);



    }
    WebDriver driver;

    public WebDriver getDriver() {

        driver=  new FirefoxDriver();
        return driver;
    }

    @Override
    public void Elemet() {
        this.element=element;
    }

}




