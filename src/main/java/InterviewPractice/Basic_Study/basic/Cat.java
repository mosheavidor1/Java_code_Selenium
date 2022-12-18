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
    public String animalColor(String color) {


      //String catC=catColor;
        color=catColor;
        System.out.println(color);
return color;
    }

    @Override
    String print() {

        String print =printCat;
        System.out.println(print);

        return print;

    }
}
