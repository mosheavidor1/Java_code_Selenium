package selenium.java.project.tests.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.java.project.infra.Google.Type_numbers_properties;
import selenium.java.project.infra.Properties.selenium.properties.Browser_Properties;
import selenium.java.project.infra.Properties.selenium.properties.Browser_help;
import selenium.java.project.infra.Properties.selenium.properties.Close_Browser;

public class Type_numbers_Test implements Browser_Properties {


    @BeforeClass
    public static void main() {

        System.setProperty(Chro_Pro, Chro_PA);


        System.setProperty(FF_Pro, FF_Path);


    }

    @Test
    public static void Test_01() {


        Browser_help C = new Browser_help();

        WebDriver driver = C.getChrome_properties();
//WebDriver driver=C.getFireFox_properties();

        Type_numbers_properties numbers = new Type_numbers_properties();
        numbers.getNumber();
        driver.get(google_url);
        driver.findElement(By.name(google_search)).click();
        driver.findElement(By.name(google_search)).sendKeys(getNum(String.valueOf(numbers.getNumber())));
    }

    @AfterTest

    public static void Close_Browser() throws Exception {

        Close_Browser b = new Close_Browser();
        b.Close_Chrome();


    }

    public static String getNum(String num) {

        String number = num;

        for (int i = 0; i <= num.length(); i++) {

        }
        return num;
    }
}

