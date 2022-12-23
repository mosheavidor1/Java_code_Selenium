package InterviewPractice.Basic_Study.basic;

import Generics.Print;
import InterviewPractice.Basic_Study.basic.Animals;

import static InterviewPractice.Basic_Study.basic.AnimalsData.*;

public class Dog extends Animals  {


    @Override
    String animalNoise() {
        String dogV=dogVoice;

        System.out.println(dogVoice);
        return dogVoice;
    }

    @Override
    String animalColor(String color) {
        color=dogColor;

        System.out.println(color);
        return color;
    }

    @Override
    String print() {

        String print = printDog;
        System.out.println(print);

        return print;

    }
}

