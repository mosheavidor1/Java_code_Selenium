package Infra.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public  class Selenium_FireFox_Driver extends Browsers implements Browser_Properties {


    @Override
    public void Drivers() {

        System.setProperty(FF_Pro, FF_Path);

    }
}



