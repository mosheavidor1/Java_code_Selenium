package selenium.java.project.tests.Google;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.java.project.infra.Google.Install;
import selenium.java.project.infra.Properties.selenium.properties.Close_Browser;
import selenium.java.project.infra.Properties.selenium.properties.Selenium_Chrome_Driver;
import selenium.java.project.infra.Properties.selenium.properties.Selenium_FireFox_Driver;

public class Google_Test {




    @BeforeTest

    public void main() {

        Selenium_Chrome_Driver C = new Selenium_Chrome_Driver();
        Selenium_FireFox_Driver F = new Selenium_FireFox_Driver();

        C.Drivers();
        F.Drivers();


    }

    @Test

    public void install_CCleaner() {


        Install Install_software = new Install();
        Install_software.install_CC();

    }


    @AfterTest

    public static void Close_Browser() throws Exception {

        Close_Browser b = new Close_Browser();
        // b.Close_Chrome();


    }
}
