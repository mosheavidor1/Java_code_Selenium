package InterviewPractice.Basic_Study.basic;

public class AnimalsAction implements AnimalsData {


     public static void AnimalsAction() {

          AnimalSpecs animal = new AnimalSpecs();
          Cat c = new Cat();
          Dog d = new Dog();

          animal.setVoice(c.animalNoise());
          animal.setColor(c.animalColor());
          System.out.println(printCat);
          animal.setVoice(d.animalNoise());
          animal.setColor(d.animalColor());
          System.out.println(printDog);

     }

        }









