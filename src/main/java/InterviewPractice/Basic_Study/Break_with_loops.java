package InterviewPractice.Basic_Study;

public class Break_with_loops {

    public static void main(String[] args) {

        Person P = new Person();

        int x = 5;

        for (int i = 0; i <= x; i++) {

            if (x >= P.age_1) {
                System.out.println(P.text_01);
                break;

            } else if (x < P.age_2) {
                System.out.println(P.text_02);
                break;

            }else if(x==5){
                System.out.println(i);
                continue;


            } else {


                System.out.println(P.text_03);
                break;



            }
        }
    }
}
