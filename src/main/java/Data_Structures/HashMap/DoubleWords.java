
package Data_Structures.HashMap;

import com.google.common.collect.Multiset;
import org.checkerframework.checker.units.qual.K;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.Key;
import java.security.KeyStore;
import java.util.*;

public class DoubleWords {

    public static void main(String[] args) throws FileNotFoundException {
         getDouble();


    }


    private static void getDouble() throws FileNotFoundException {

        File path = new File("C:\\practice\\words.txt");

        Scanner text = new Scanner(path);

        String words[] = text.nextLine().split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.get(word) != null) {
                map.put(word, map.get(word) + 1);

            } else {
                map.put(word, 1);
            }
        }
        Set<String> key = map.keySet();
        for (String value : key) {
            if (map.get(value) > 1)
           System.out.println(value+":"+map.get(value));

        }

    }
}









