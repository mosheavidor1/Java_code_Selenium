package Lamdas;

import InterviewPractice.Basic_Study.basic.AnimalsData;

public class PeopleTestLamdas {

    public static void main(String[] args) {

      People_Actions d =(s) ->"hello"+s;

       action(d::play);

    }


  private   static People_Actions action(People_Actions playing) {

      System.out.println(playing.play(" "+"!"));

        return playing;

    }

}
