package InterviewPractice.Basic_Study;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementsFromArray {

    public static void main(String[] args) {


        String originalArr[] = {"moshe", "David", "John", "Yoram"};

        String secondArr[] = {};

        System.out.println(ArrRemove(originalArr,secondArr,"John"));


    }

    private static String ArrRemove(String arrOriginal[], String arrTemp[], String word) {

        word = "";

        for (int i = 0; i < arrOriginal.length; i++) {
            for (int j = 0; j < arrTemp.length; j++) {

                if (word != null) {
                    arrOriginal[i] = arrTemp[j];

                }
            }


        }
        return arrTemp[2];

    }
}





