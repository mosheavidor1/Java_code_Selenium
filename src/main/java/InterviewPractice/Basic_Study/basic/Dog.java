package InterviewPractice.Basic_Study.basic;

import Generics.Print;
import InterviewPractice.Basic_Study.basic.Animals;

public class Dog extends Animals implements AnimalsData {


    @Override
    String animalNoise() {
        String dogV=dogVoice;

        System.out.println(dogVoice);
        return dogVoice;
    }

    @Override
    String animalColor() {
        String dogC=dogColor;

        System.out.println(dogColor);
        return dogColor;
    }

    @Override
    String print() {

        String print = printDog;
        System.out.println(print);

        return print;

    }
}

