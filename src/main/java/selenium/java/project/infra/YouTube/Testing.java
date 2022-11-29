package selenium.java.project.infra.YouTube;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.java.project.infra.Properties.selenium.properties.Close_Browser;
import selenium.java.project.infra.Properties.selenium.properties.Selenium_Chrome_Driver;

public class Testing {


    @BeforeTest

    public void main() {
        Selenium_Chrome_Driver C = new Selenium_Chrome_Driver();
        C.Drivers();


    }


    @Test

    public void Test_01() {


        Play Start = new Play();
        Start.PlayOnYouTube();
    }

    @AfterTest

    public void Close_Browser() throws Exception {
        Thread.sleep(1000);
        Close_Browser b = new Close_Browser();
        b.Close_Chrome();

    }

}
















