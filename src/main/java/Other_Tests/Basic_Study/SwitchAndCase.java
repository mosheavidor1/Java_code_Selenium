package Other_Tests.Basic_Study;

public class SwitchAndCase {

    public static void main(String[] args) {

        int x = 50;

        for (int i = 0; i <= x; i++) {


                if (x < 100) {

                    switch (x) {
                        case 50:
                            System.out.println("hello");
                            break;
                        case 40:
                            System.out.println("bye");
                            break;

                        default:
                            System.out.println("WoW");
                    }

                } else if (x == 100) {
                    System.out.println("moshe");
                } else {
                    System.out.println("Alex");
                }
            }
        }
    }
