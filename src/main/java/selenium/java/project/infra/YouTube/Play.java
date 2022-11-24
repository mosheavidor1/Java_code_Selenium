package selenium.java.project.infra.YouTube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Play {

    WebDriver driver;
    WebElement element;


    Constant_Add add = new Constant_Add();


    public void PlayOnYouTube() {
        driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get(add.YouTube);
        String Play_Button = add.Play;


        try {

            element = driver.findElement(By.xpath(Play_Button));


            if (element.isDisplayed()) {
                element.click();
                System.out.println("Success");

            }


        } catch (Exception e) {


            System.out.println("Element does not exist");
        }
    }

}

