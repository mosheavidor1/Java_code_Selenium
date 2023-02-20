package cheg.GoogleTranslate.test.tesng_page.test_actions;

import cheg.GoogleTranslate.infra.scanner.TextActions;
import cheg.GoogleTranslate.infra.web_elements.WaitForElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static cheg.GoogleTranslate.infra.web_elements.languages.LanguageElements.GOOGLE_TRANSLATE_URL;
import static cheg.GoogleTranslate.infra.web_elements.languages.LanguageElements.SOURCE_LANGUAGE;


public class TranslateFromFile {

    WebDriver driver;

    String FileRead;


    // Typing the text to be translated.
    public void Read(WebDriver driver, String FileRead) throws InterruptedException {
        this.driver = driver;
        this.FileRead = FileRead;


        WaitForElement wait=new WaitForElement(driver,30);

        driver.get(GOOGLE_TRANSLATE_URL);
        driver.manage().window().fullscreen();
        driver.findElement(By.cssSelector(SOURCE_LANGUAGE)).sendKeys(FileRead);

        //This function will print the Translated text from Google Translate and will verify language detection works(true/false)

        TextActions.GetText(driver);




        }


    }


