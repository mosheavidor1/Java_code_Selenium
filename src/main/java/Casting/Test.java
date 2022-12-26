package Casting;

public class Test {

    public static void main(String[] args) {

        int x = (int)10.5;

        Animals cat = new Cat();
        Animals dog = new Dog();

        //Upcasting example


        AnimalsData catVoice= new AnimalsData(cat);
      AnimalsData dogVoice= new AnimalsData(dog);

      dogVoice.voice.makeNoise();
      catVoice.voice.makeNoise();





     //Print casting from double to int.
        System.out.println(x);


















    }


}
