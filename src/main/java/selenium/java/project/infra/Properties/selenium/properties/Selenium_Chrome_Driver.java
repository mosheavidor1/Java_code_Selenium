package selenium.java.project.infra.Properties.selenium.properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Chrome_Driver extends Browsers implements Browser_Properties {


    @Override
    public void Drivers() {
        System.setProperty(Chro_Pro, Chro_PA);


    }

    @Override
    public void Element() {
        this.element = element;
    }

    WebDriver driver;

    public WebDriver getDriver() {

        driver = new ChromeDriver();
        return driver;
    }
}


