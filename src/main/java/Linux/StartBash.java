package Linux;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartBash{
    public static void main(String[] args) {
        try {
            // Open the Linux terminal
            Process process = Runtime.getRuntime().exec("cmd /c start bash");

            // Read any errors from the command
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
