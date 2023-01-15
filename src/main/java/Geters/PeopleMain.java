package Geters;

import java.util.Scanner;

public class PeopleMain {

    public static void main(String[] args) {

        People people=new People("Moshe",39);
        GradesChoose gradesChoose= new GradesChoose();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter grade : ");
        String input = scanner.nextLine();
        Grades grade = Grades.valueOf(input.toUpperCase());
        gradesChoose.chooseGrade(grade);



        System.out.println("Name :"+people.getName());
        System.out.println("Age : "+people.getAge());
        people.setName("Alex");
        people.setAge(35);
        people.printOccupation();
        System.out.println(people.toString());

        System.out.println(people.getName()+" "+Grades.A.getGradeDescription());







    }
}
