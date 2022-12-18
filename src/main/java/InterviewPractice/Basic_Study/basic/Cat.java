package InterviewPractice.Basic_Study.basic;

import InterviewPractice.Basic_Study.basic.Animals;

public class Cat extends Animals implements AnimalsData {
    @Override
    public String animalNoise() {

        String catV=catVoice;

        System.out.println(catVoice);


return  catVoice;
    }

    @Override
    public String animalColor() {


      String catC=catColor;
        System.out.println(catColor);
return catColor;
    }

    @Override
    String print() {

        String print =printCat;
        System.out.println(print);

        return print;

    }
}
