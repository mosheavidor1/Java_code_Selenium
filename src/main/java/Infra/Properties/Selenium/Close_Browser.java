package Infra.Properties.Selenium;

import static Infra.Properties.Selenium.KillProcess.isProcessRunning;
import static Infra.Properties.Selenium.KillProcess.killProcess;

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

