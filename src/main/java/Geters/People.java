
package Geters;

public class People implements PeopleInfo {
    private String name;
    private int age;
    private static String occupation = "Software engineer";

    public People(String name, int age) {
        this.name = name;
        if (age > 0) {
            this.age = age;
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String getOccupation() {
        return occupation;
    }

    @Override
    public void chooseGrade(Grades grade) {
        GradesChoose gradesChoose = new GradesChoose();
        gradesChoose.chooseGrade(grade);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ").append(name).append(",Age: ").append(age).append(",Occupation").append(occupation);
        return stringBuilder.toString();
    }

    @Override
    public void printOccupation() {

    }
}
