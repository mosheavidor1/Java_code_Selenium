package Geters;

public enum Grades {

    A("Excellent"),B("Good"),C("Avarage");
    private String gradeDescription;

   Grades(String gradeDescription){
       this.gradeDescription=gradeDescription;

  }
  public String getGradeDescription(){
       return gradeDescription;
  }
}


