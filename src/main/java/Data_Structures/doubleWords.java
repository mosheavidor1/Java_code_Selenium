package Data_Structures;

import com.google.common.collect.Multiset;
import org.checkerframework.checker.units.qual.K;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.Key;
import java.security.KeyStore;
import java.util.*;

public class doubleWords {

    public static void main(String[] args) throws FileNotFoundException {

        getDouble();
    }

    public static void getDouble() throws FileNotFoundException {



        HashMap<String, Integer> words = new HashMap<>();

            words.put("Moshe", 2);
            words.put("Moshe", 8);
            words.put("Alex", 4);
            words.put("Yoni", 6);

//
//           for(Map.Entry<String,Integer>key:words.entrySet()){
//            System.out.print(key+":"+" ");


        for(Map.Entry<String,Integer>key:words.entrySet()){
            System.out.println(key.getKey()+": "+key.getValue());
        }

    }
}
//        Scanner sc = new Scanner(path);
//
//        String text[] = sc.nextLine().split("");
//
//        Map<String, Integer> words = new HashMap<>();
//
//        for (int i=0;i<text.length;i++) {
//            if (text.length > 1) {
//                words.put(text.toString(), text.length);
//
//            } else {
//                words.get(text.length);
//            }
//
//        }
//
//       Set<String>key=words.keySet();
//        for (int i = 0; i < key.size(); i++) {
//            if (i > 1) {
//                System.out.println(key.size());
//            }
//
//        }
//
//    }
//}
//
//
