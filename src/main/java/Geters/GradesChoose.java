package Geters;

public   class GradesChoose {


    public void chooseGrade(Grades grade) {
        switch (grade) {
            case A:
                System.out.println("Excellent");
                break;
            case B:
                System.out.println("Good");
                break;
            case C:
                System.out.println("Average");
                break;

            default:
                System.out.println("Invalid grade");
        }

    }
}
