package selenium.java.project.infra.Properties.selenium.properties;

import static selenium.java.project.infra.Properties.selenium.properties.KillProcess.isProcessRunning;
import static selenium.java.project.infra.Properties.selenium.properties.KillProcess.killProcess;

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

