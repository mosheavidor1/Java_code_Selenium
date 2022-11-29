package InterviewPractice.Basic_Study.loops;

public class MaxNumber {


    public static void main(String[] args) {

        int[] arr = {5, 3, 66, 2};
        System.out.println(getMax(arr));

    }


    private static int getMax(int[] num) {

        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }

        }
        return max;

    }
}
