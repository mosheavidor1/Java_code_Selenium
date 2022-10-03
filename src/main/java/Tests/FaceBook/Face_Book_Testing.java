package Tests.FaceBook;

import Infra.Facebook_Infra.FaceBook_Login_Page;
import Infra.Selenium.Selenium_Chrome_Driver;
import Infra.Selenium.Selenium_FireFox_Driver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public interface Face_Book_Testing {

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


        }


    }
