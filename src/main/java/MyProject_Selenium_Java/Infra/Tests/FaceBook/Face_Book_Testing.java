package MyProject_Selenium_Java.Infra.Tests.FaceBook;

import MyProject_Selenium_Java.Infra.Facebook_Infra.FaceBook_Login_Page;
import MyProject_Selenium_Java.Infra.Selenium.Properties.Close_Browser;
import MyProject_Selenium_Java.Infra.Selenium.Properties.Selenium_Chrome_Driver;
import MyProject_Selenium_Java.Infra.Selenium.Properties.Selenium_FireFox_Driver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Face_Book_Testing {

    @BeforeClass

    public static void main() {


        Selenium_Chrome_Driver C = new Selenium_Chrome_Driver();
        Selenium_FireFox_Driver F = new Selenium_FireFox_Driver();

        C.Drivers();
        F.Drivers();


    }


    @Test(priority = 1)

    public static void LoginToFaceBook_01() throws InterruptedException {

        FaceBook_Login_Page Log = new FaceBook_Login_Page();
        Log.Login_Page();
        Thread.sleep(10000);


    }

    @AfterTest

    public static void Close_Browser() throws Exception {

        Close_Browser b = new Close_Browser();
        b.Close_Chrome();


    }


}
