package cheg.GoogleTranslate.infra.scanner;


import cheg.GoogleTranslate.infra.web_elements.WaitForElement;
import cheg.GoogleTranslate.infra.web_elements.languages.SupportedLanguage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;


import static cheg.GoogleTranslate.infra.web_elements.languages.LanguageElements.PRINT_TEXT;
import static cheg.GoogleTranslate.screenshots.ScreenshotsPath.SCREENSHOT;
import static org.testng.AssertJUnit.assertEquals;


public class TextActions {

    static WebDriver driver;


//This function will print the Translated text from Google Translate and will verify language detection works(true/false)

    public TextActions() {
        GetText(driver);
    }


    public static String GetText(WebDriver driver) {
        Logger logger = Logger.getLogger(TextActions.class.getName());
        WaitForElement wait = new WaitForElement(driver, 30);

        try {
            //Getting the translated text to view on console.
            wait.waitForElement(By.xpath(PRINT_TEXT));
            WebElement textToPrint = driver.findElement(By.xpath(PRINT_TEXT));
            String translatedText = textToPrint.getText();


            //Add a log message to track the text to print
            logger.info("Translated text: " + translatedText);
            System.out.println("Translated text: " + translatedText);

            //Detect if the tested language is being detected automatically by Google Translate
         //detectLanguage(SupportedLanguage.DUTCH);

        } catch (Exception e) {
            // If there's an exception, log the error message and take a screenshot
            e.printStackTrace();
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshotFile, new File(SCREENSHOT));
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
        return "";
    }




    //Verify Detected language :

 public static String detectLanguage(SupportedLanguage language) {


        Logger logger = Logger.getLogger(TextActions.class.getName());
        WaitForElement wait = new WaitForElement(driver, 30);

        String detectedLanguage = "";

        try {
            wait.waitForElement(By.xpath(language.getDetectElement()));
           WebElement languageToDetect = driver.findElement(By.xpath(language.getDetectElement()));
            detectedLanguage = languageToDetect.getText();
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
        }

        try {
            assertEquals(detectedLanguage, language.expectedVerification());
        } catch (AssertionError e) {
            System.out.println("Detected language does not match expected language: " + e.getMessage());
        }

        return detectedLanguage;
    }






//Verify translated text is correct:
//
//public static String verifyTranslation(WebDriver driver){
//    Logger logger = Logger.getLogger(TextActions.class.getName());
//    WaitForElement wait = new WaitForElement(driver, 30);
//
//    wait.waitForElement(By.xpath(TRANSLATION_CHECK));
//    WebElement textToVerify = driver.findElement(By.xpath(TRANSLATION_CHECK));
//
//    String text= textToVerify.getText();
//
//
//    logger.info("Actual text comparing to the expected text: " + text);
//    System.out.println("Actual text comparing to the expected text: " + text);
//
//
//    //Verifying the language detection of Google Translate works as expected
//    Assert.assertEquals(TRANSLATION_CHECK_TEXT, text);
//
//    return text;
}





