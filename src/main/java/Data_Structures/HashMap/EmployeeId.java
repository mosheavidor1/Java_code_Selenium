package Data_Structures.HashMap;

import java.util.HashMap;

public class EmployeeId {

    public static void main(String[] args) {

        HashMap<String, Integer> EMPI = new HashMap<>();

        EMPI.put("Moshe", 10);
        EMPI.put("Danny", 20);
        EMPI.put("John", 70);
        EMPI.put("Sam", 4);
        EMPI.put("Guy", 35);
        EMPI.put("Ben", 14);
        EMPI.put("Chris", 30);

        System.out.println(EMPI);
        System.out.println(EMPI.get("John"));
    }
}

