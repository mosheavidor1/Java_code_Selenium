package InterviewPractice.Basic_Study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class SumOfArrays {
    public static void main(String[] args) {
        int[] a = {2, 4};
        int[] b = {5, 10};

        //System.out.println(Arrays.toString(Sum(a, b)));
        System.out.println(Sum(a,b));
    }

    public static int Sum(int[] A, int[] B) {
        int[] C = new int[2];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }
        int sum = 0;
        for (int i = 0; i < C.length; i++) {
            sum += C[i];
        }

        return sum;

    }
}


//Second way - using J in the for loop :


//public class SumOfArrays {
//
//
//    public static void main(String[] args) {
//        int[] a = {2, 4};
//        int[] b = {3, 10};
//
//
//
//        System.out.println(Arrays.toString(Sum(a, b)));
//
//
//    }
//
//    public static int[] Sum(int[] A, int[] B) {
//
//        int[] C = new int[2];
//
//
//        try {
//            for (int i = 0; i <= A.length; i++) {
//                C[i] = A[i] + B[i];
//
//                for (int j = 0; j <= B.length; j++) {
//                    C[j] = A[j] + B[j];
//
//                }
//            }
//            int sum = 0;
//            for (int i = 0; i <= C.length; i++) {
//                sum += C[i];
//            }
//            System.out.println("Sum of the two arrays: " + sum);
//            return C;
//        } catch (ArrayIndexOutOfBoundsException e) {
//
//        }
//
//return C;
//    }
//
//}
//
//
//
//
//
//
////Create the sum of 2 array A{}+B{}=C{} and the sum of all the numbers in c{};
////For example - A{ 2,4} B{5,10} -> 2+5 , 4+10  C{7,14} -> C=21;
