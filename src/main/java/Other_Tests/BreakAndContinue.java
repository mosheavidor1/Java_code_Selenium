package Other_Tests;

public class BreakAndContinue {

    public static void main(String[] args) {

        Person P = new Person();

        int x=80;

        for (int i = 0; i <= x; i++) {

            if (x>=P.age_1) {
                System.out.println(P.text_01);
              break;

            } else if (x<P.age_2) {
                System.out.println(P.text_02);
                break;


            } else {


                System.out.println(P.text_03);
                break;



            }
        }
    }
}
