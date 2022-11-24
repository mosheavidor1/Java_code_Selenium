package selenium.java.project.infra.Facebook_Infra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Login_Page {

    //private WebDriver driver=new FirefoxDriver();
    private WebDriver driver = new ChromeDriver();


    Login L = new Login();

    public void Login_Page() throws InterruptedException {


        driver.get(Login.FaceBookURL);
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(L.getUserName())).click();
        driver.findElement(By.cssSelector(L.getUserName())).sendKeys(L.setUserName(Login.User));
        driver.findElement(By.cssSelector(L.getPassword())).click();
        driver.findElement(By.cssSelector(L.getPassword())).sendKeys(L.setPassword(Login.Pass));
        driver.findElement(By.xpath(Login.Login_elm)).click();


        Thread.sleep(1000);


    }

}



