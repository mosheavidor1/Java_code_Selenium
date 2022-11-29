package Sort;

import java.util.Arrays;

public class StreaArraySorted {


    public static void main(String[] args) {

        int[] numbers = {3, 2, 7, 5, 1, 8};
        arr(Arrays.stream(numbers).sorted().toArray());


    }


    private static int[] arr(int[] num) {


        for (int i = 0; i < num.length; i++) {

            System.out.println(num[i]);


        }
        return num;

    }
}


