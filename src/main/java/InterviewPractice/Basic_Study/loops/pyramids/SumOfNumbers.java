package InterviewPractice.Basic_Study.loops.pyramids;

public class SumOfNumbers {

    public static void main(String[] args) {

        int size = 4;
        int count = 1;
        int sum = 0;
        int num = 1;
        System.out.println(num);
        for (int i = 3; i <= size; i++) {
            for (int j = 2; j <= i; j++) {

                System.out.print(j + " ");
                {

                    sum = j - count;
                    sum = sum + j;
                }

            }
            System.out.println();

            System.out.print(sum+" ");



        }

    }
}









//1
//2 3
//5 6 7
//11 12 13 14
//23 24 25 26 27
