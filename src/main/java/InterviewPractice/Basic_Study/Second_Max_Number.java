package InterviewPractice.Basic_Study;

import java.util.Arrays;

public class Second_Max_Number {

    public static void main(String[] args) {

        int arr[] = {480, 900, 48, 130, 100, 7};

        System.out.println(GetSecondMax(arr));


    }


    public static int GetSecondMax(int num[]) {
        Arrays.sort(num);

        int length=num[num.length-2];

return length;
    }




}


