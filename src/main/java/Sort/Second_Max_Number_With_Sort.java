package Sort;

import java.util.Arrays;

public class Second_Max_Number_With_Sort {

    public static void main(String[] args) {

        int[] arr = {480, 900, 48, 130, 100, 7};

        System.out.println(GetSecondMax(arr));

        //Look at the other way to do this : Look at the email gmail .


    }


    public static int GetSecondMax(int[] num) {
        Arrays.sort(num);

        int length = num[num.length - 2];

        return length;
    }


}


