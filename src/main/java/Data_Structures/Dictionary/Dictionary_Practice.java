package Data_Structures.Dictionary;

import java.util.Dictionary;
import java.util.Hashtable;

public class Dictionary_Practice {

    public static void main(String[] args) {


        Dictionary<String, Integer> Dic = new Hashtable<>();

        Dic.put("moshe", 1);
        Dic.put("Alex", 2);
        Dic.put("Bob", 3);
        Dic.put("Stone", 44);
        Dic.put("Jim", 23);
        Dic.put("Fd", 66);

        System.out.println(Dic);

    }
}

