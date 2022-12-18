package InterviewPractice.Basic_Study.basic;

import InterviewPractice.Basic_Study.basic.Animals;

public class Dog extends Animals {


    @Override
    String animalNoise() {
        String dogVoice="The dog barks";

        System.out.println(dogVoice);
        return dogVoice;
    }

    @Override
    String animalColor() {
        String dogColor="The dogs color is brown";

        System.out.println(dogColor);
        return dogColor;
    }
}

