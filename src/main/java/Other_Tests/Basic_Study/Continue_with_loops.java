package Other_Tests.Basic_Study;

public class Continue_with_loops {
    public static void main(String[] args) {

//This code will not show the numbers on the continue statement . 7 and 5.
        int x = 10;

        for (int i = 0; i <= x; i++) {
            if (i == 5 || i==7) {
                continue;
            }
            System.out.println(i);
        }
    }

    }
