package InterviewPractice.Basic_Study.loops.pyramids;

public class SumOfNumbers {

    public static void main(String[] args) {

        int num1 = 1, num2 = 2, num3 = 3, sum,size = 5;
        System.out.println(num1);
        System.out.print(num2 + " " + num3);
        System.out.println();
        sum=num2+num3;



        for(int i=4;i<=size;i++){

            for(int j=2;j<=i;j++,sum++){

                System.out.print(sum+" ");

            }



            System.out.println();



        }



    }
}





//1
//2 3
//5 6 7
//11 12 13 14
//23 24 25 26 27
