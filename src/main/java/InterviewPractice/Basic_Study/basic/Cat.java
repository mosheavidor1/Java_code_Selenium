package InterviewPractice.Basic_Study.basic;

import InterviewPractice.Basic_Study.basic.Animals;

public class Cat extends Animals {
    @Override
    public String animalNoise() {

        String catVoice="The cat says Mew";

        System.out.println(catVoice);


return  catVoice;
    }

    @Override
    public String animalColor() {

        String catColor="The cats color is white";

        System.out.println(catColor);
return catColor;
    }
}
