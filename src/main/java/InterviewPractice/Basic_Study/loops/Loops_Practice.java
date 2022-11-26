package InterviewPractice.Basic_Study.loops;

public class Loops_Practice {

    public static void main(String[] args) {
        System.out.println(getThis());


    }

    public static boolean getThis() {

        int x = 11;
        for (int i = 1; i < x; i++) {
            if (x < i) {
                return true;
            } else {
                return false;
            }
        }
        return getThis();
    }
}

