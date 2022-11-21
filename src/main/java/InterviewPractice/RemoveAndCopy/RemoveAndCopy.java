package InterviewPractice.RemoveAndCopy;

import java.util.ArrayList;
import java.util.List;

public  class RemoveAndCopy implements RemoveAndCopyMessages {

    ValueConfiguration v = new ValueConfiguration();
 String SetV= v.setValue(Value);
 String value=v.getValue();

    public  String remove(String value) {

   this.value=value;

        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arrTemp = new ArrayList<>();
        arr.addAll(List.of(NAMES));
        System.out.println(Message_Before_The_Change +SPACE + arr);
        System.out.println("\n");

        for (int i = 0; i < arr.size(); i++) {
            while (arr.contains(value) && arrTemp.isEmpty()) {
                arrTemp.add(value);
                arr.remove(value);


            }

            System.out.println(Message_After_The_Change + SPACE + arr);
            System.out.println("\n");
            System.out.println(Message_For_NEW_Temp_Arr + SPACE + arrTemp);

            break;


        }
return value  ;


    }
}
