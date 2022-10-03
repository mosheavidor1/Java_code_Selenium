package Infra.Selenium;

import static Infra.Selenium.KillProcess.isProcessRunning;
import static Infra.Selenium.KillProcess.killProcess;

public  class Close_Browser {

    public void Close_Chrome() throws Exception {

        String processName = "chrome.exe";
        if (

                isProcessRunning(processName)) {

            killProcess(processName);


        }
    }
}

