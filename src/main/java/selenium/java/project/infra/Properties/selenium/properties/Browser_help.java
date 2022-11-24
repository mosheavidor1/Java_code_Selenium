package selenium.java.project.infra.Properties.selenium.properties;

import org.openqa.selenium.WebDriver;

public class Browser_help {


    public WebDriver getChrome_properties() {

        Selenium_Chrome_Driver C = new Selenium_Chrome_Driver();
        WebDriver driver = C.getDriver();
        FullSizeWindow F = new FullSizeWindow();

        F.Full_Size(driver);


        return driver;
    }


    public WebDriver getFireFox_properties() {

        Selenium_FireFox_Driver F = new Selenium_FireFox_Driver();
        WebDriver driver = F.getDriver();
        FullSizeWindow FS = new FullSizeWindow();

        FS.Full_Size(driver);


        return driver;


    }
}
