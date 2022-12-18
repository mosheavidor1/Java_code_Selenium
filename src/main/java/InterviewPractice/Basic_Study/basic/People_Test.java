package InterviewPractice.Basic_Study.basic;

public class People_Test {

    public static void main(String[] args) {
        People people = new People("Moshe",39);


        people.setName("Chris");
        people.setAge(30);


        System.out.println(people.getName()+" "+people.getAge());
    }
}
