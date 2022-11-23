package MyProject_Selenium_Java.Infra.Selenium.Properties;

import static MyProject_Selenium_Java.Infra.Selenium.Properties.KillProcess.isProcessRunning;
import static MyProject_Selenium_Java.Infra.Selenium.Properties.KillProcess.killProcess;

public class Close_Browser {

    public void Close_Chrome() throws Exception {

        String processName = "chrome.exe";
        // String processName = "firefox";

        if (

                isProcessRunning(processName)) {

            killProcess(processName);


        }
    }
}

