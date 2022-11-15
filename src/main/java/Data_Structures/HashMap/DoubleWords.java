package Data_Structures.HashMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DoubleWords{
    public static void main(String[] args) throws FileNotFoundException {
        Double();

    }

    public static void Double() throws FileNotFoundException {
        File path = new File("C:\\Practice\\DoubleWords.txt");
        Scanner scan = new Scanner(path);
        String text = scan.nextLine();
        String words[]=text.split(" ");
        Map<String,Integer> counter= new HashMap<String, Integer>();
        for (int i=0;i<words.length;i++) {
            if (counter.containsKey(words[i])) {
                counter.put(words[i], counter.get(words[i]) + 1);
            } else {
                counter.put(words[i], 1);
            }
        }
  Set<String> execute= counter.keySet();

        for(int i=0;i<execute.size();i++){
            if(counter.get(words[i])>1){
                System.out.print(words[i]+": "+counter.get(words[i]));

            }
        }

    }
}
