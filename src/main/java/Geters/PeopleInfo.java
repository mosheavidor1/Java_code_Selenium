package Geters;

public interface PeopleInfo {

        void setName(String name);
        String getName();
        void setAge(int age);
        int getAge();
        void setOccupation(String occupation);
        String getOccupation();
        void chooseGrade(Grades grade);
        String toString();

    void printOccupation();
}


