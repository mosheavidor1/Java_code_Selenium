package InterviewPractice.Basic_Study.loops.pyramids;

public class SumOfNumbers {

    public static void main(String[] args) {

 int size=10,num1=1,num2=2,num3=3,sumJ,sumI;
 sumJ=num2+num3;
        System.out.println(num1);
        System.out.println(num2+" "+num3);


        for (int i = 4; i <= size; i++, sumI++) {
            sumI = sumJ + (sumJ + 1);
            for (int j = 2; j <= i; j++, sumJ++) {
                System.out.print(sumJ + " ");
            }
            sumJ = sumI;
            System.out.println(sumI);
        }
    }
}




//1
//2 3
//5 6 7
//11 12 13 14
//23 24 25 26 27
