package InterviewPractice.Basic_Study.basic;

public class People_Test {

    public static void main(String[] args) {


        AnimalsData d =(s) -> "hello"+s;

     getPlay(d::play);
     }










    static AnimalsData getPlay(AnimalsData data){

        System.out.println(data.play("!"));
        return data;

    }
}