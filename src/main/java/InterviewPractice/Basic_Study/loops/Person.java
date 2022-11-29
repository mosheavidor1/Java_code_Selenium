package InterviewPractice.Basic_Study.loops;

public class Person {

    int age_1 = 100;
    int age_2 = 50;


    String text_01 = "Bigger than 100 ";
    String text_02 = "Smaller than 50 ";
    String text_03 = "Bye ";


    public int getAge_01() {

        System.out.println("The age is " + text_01);
        return getAge_01();
    }

    public void setAge_01(int age_1) {

        this.age_1 = age_1;


    }

    public int getAge_02() {

        System.out.println("The age is " + text_02);

        return getAge_02();
    }

    public void setAge_02(int age_2) {

        this.age_2 = age_2;

    }

    public int getAge_03() {

        System.out.println("The age is " + text_03);

        return getAge_03();


    }

}