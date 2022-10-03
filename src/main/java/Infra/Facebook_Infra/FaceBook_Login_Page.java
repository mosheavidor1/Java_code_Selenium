package Infra.Facebook_Infra;

import Infra.Selenium.Selenium_Chrome_Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook_Login_Page {

private WebDriver driver = new FirefoxDriver();


    public void Login_Page() throws InterruptedException {


      driver.get(Login.FaceBookURL);
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(Login.User_elm)).click();
        driver.findElement(By.cssSelector(Login.User_elm)).sendKeys(Login.User);
        driver.findElement(By.cssSelector(Login.Pass_elm)).click();
        driver.findElement(By.cssSelector(Login.Pass_elm)).sendKeys(Login.Pass);
        driver.findElement(By.xpath(Login.Login_elm)).click();

        Thread.sleep(1000);








        }

    }



