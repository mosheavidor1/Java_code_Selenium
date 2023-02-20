package GE.Selenium.Tests;


import GE.Selenium.Infra.ElementConstans;
import GE.Selenium.Infra.LoginCredentials;
import GE.Selenium.Infra.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Login screen
public class Login  {

        WebDriver driver;

        ElementConstans elementConstans = new ElementConstans();
        LoginCredentials loginCredentials = new LoginCredentials();


//Set Login elements .
        public void LoginSet(WebDriver driver) {
                this.driver = driver;
                Wait wait = new Wait(driver, 30);

                driver.get(elementConstans.url);

                driver.manage().window().fullscreen();
                wait.waitForElement(By.cssSelector(loginCredentials.getUser()));

                driver.findElement(By.cssSelector(loginCredentials.getUser())).sendKeys(loginCredentials.setUser(elementConstans.UserName));

                driver.findElement(By.cssSelector(loginCredentials.getPassword())).sendKeys(loginCredentials.setPassword(elementConstans.Pass));


                wait.waitForElement(By.xpath(loginCredentials.getClick()));
                driver.findElement(By.xpath(loginCredentials.getClick())).submit();
                driver.manage().window().fullscreen();


        }

}