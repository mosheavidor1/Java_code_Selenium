package MyProject_Selenium_Java.Infra.Tests.Google;

import MyProject_Selenium_Java.Infra.Google.Install;
import MyProject_Selenium_Java.Infra.Properties.Selenium.Close_Browser;
import MyProject_Selenium_Java.Infra.Properties.Selenium.Selenium_Chrome_Driver;
import MyProject_Selenium_Java.Infra.Properties.Selenium.Selenium_FireFox_Driver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
