package Data_Structures.HashMap;

import java.util.HashMap;

public class Names {
    public static void main(String[] args) {

        HashMap<String, Integer> MyMap = new HashMap();

        MyMap.put("moshe", 15);
        MyMap.put("Bob", 25);
        MyMap.put("Chris", 35);
        MyMap.put("John", 45);
        MyMap.put("Danny", 55);
        System.out.println(MyMap);


        for (int i = 0; i < MyMap.size(); i++) {
            System.out.println();
        }


    }
}

