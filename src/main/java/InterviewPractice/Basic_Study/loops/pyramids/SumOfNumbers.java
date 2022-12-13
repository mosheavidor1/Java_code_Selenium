package InterviewPractice.Basic_Study.loops.pyramids;

public class SumOfNumbers {



    public static boolean sum(int size){

 int firstPrint=1,num=1,num1=1,sumJ,sumI;
        System.out.println(firstPrint);
       sumJ=num+num1;
        for (int i = 3; i <= size; i++, sumI++) {
            sumI = sumJ + (sumJ + 1);

            for (int j = 2; j <= i; j++,sumJ++) {

               System.out.print(sumJ + " ");

            }
            sumJ=sumI;
            System.out.println();
        }
        return true;



    }

}




//1
//2 3
//5 6 7
//11 12 13 14
//23 24 25 26 27
