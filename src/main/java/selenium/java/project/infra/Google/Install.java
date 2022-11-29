package selenium.java.project.infra.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import selenium.java.project.infra.Properties.selenium.properties.FullSizeWindow;

import java.util.logging.Logger;

public class Install {

    private final WebDriver driver = new ChromeDriver();
    Logger logger = Logger.getLogger("Testing");
    FullSizeWindow Enlarge_Browser_Window = new FullSizeWindow();

    public void install_CC() {
        try {

            driver.get("https://google.com");

            logger.info("Website is up");
            System.out.println("Websiste is up");

        } catch (Exception moshe) {
            logger.info("Website is not up :NAME_NOT_RESOLVED");
            System.out.println("Website is not up :NAME_NOT_RESOLVED");

        }
        Enlarge_Browser_Window.Full_Size(driver);


        try {
            WebElement element = driver.findElement(By.name("q"));
            {
                if (element.isDisplayed()) {
                    element.click();
                    {
                        AssertJUnit.assertTrue(true);
                        logger.info("elment was clicked");
                        {
                            System.out.println("elment was clicked");
                        }
                        element.sendKeys("Install ccleaner");
                        AssertJUnit.assertTrue(true);
                        logger.info("Typing in google search");
                        {
                            System.out.println("Typing in google search");
                        }

                    }
                }
            }
        } catch (Exception exception) {
            AssertJUnit.assertFalse(false);
            logger.info("Can not find the specific element");
            {
                System.out.println("Can not find the specific element");
            }


        } finally {

            logger.info("Test is Finished");
            {
                System.out.println("Test is Finished");

            }


        }


    }

}









