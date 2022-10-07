package Tests.FaceBook;

import Infra.Facebook_Infra.FaceBook_Login_Page;
import Infra.Properties.Selenium.Close_Browser;
import Infra.Properties.Selenium.Selenium_Chrome_Driver;
import Infra.Properties.Selenium.Selenium_FireFox_Driver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Face_Book_Testing {

    @BeforeClass

    public static void main(){


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
