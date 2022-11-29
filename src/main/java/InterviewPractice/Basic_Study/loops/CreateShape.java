package InterviewPractice.Basic_Study.loops;

public class CreateShape {

    public int[][] pyramid(int i, int j) {

        int[][] arr = new int[10][10];
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*" + " ");


            }
            System.out.println();
        }
        return arr;
    }
}
