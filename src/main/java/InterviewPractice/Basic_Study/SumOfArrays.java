package InterviewPractice.Basic_Study;

import java.util.Arrays;

public class SumOfArrays {


    public static void main(String[] args) {
        int []a= {2,4};
        int []b= {3,10};
        System.out.println(Arrays.toString(Sum(a,b)));


    }


    public static int [] Sum(int[] A,int[] B){


        int[] C = new int[2];

        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++) {
             C[0] = A[0] + B[0];





            }
            while (true){
                C[0]=A[0]+B[0];
                A[0]++;
                B[0]++;
                C[0]++;


            }

        }
        return C;

    }

}







//Create the sum of 2 array A{}+B{}=C{} and the sum of all the numbers in c{};
//For example - A{ 2,4} B{5,10} -> 2+5 , 4+10  C{7,14} -> C=21;
