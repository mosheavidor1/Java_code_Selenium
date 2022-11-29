package InterviewPractice.RemoveAndCopy;

import java.util.Arrays;

public class DeleteElemet {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(arr));
        System.out.println(delete(arr, 1));


    }

    private static boolean delete(int[] firstArr, int index) {

        int[] secondArr = new int[firstArr.length - 1];

        for (int i = 0, k = 0; i < firstArr.length; i++) {
            if (i == index) {

                continue;

            }
            secondArr[k++] = firstArr[i];
        }
        System.out.println(Arrays.toString(secondArr));
        return true;
    }


}

