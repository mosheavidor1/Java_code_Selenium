package Tests.Google;

import Infra.Properties.Selenium.Browser_Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Type_numbers_Test implements Browser_Properties {




public WebDriver driver;

@BeforeClass
    public void main(){


        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");





    }

    @Test
    public  void Test_01() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        int numbers=123456789;
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys(getNum(String.valueOf(numbers)));
    }

    public String getNum(String num){

    String number=num;

    for(int i=0;i<=num.length();i++){

    }
    return num;
}
}