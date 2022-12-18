package InterviewPractice.Basic_Study.basic;

public class AnimalsAction implements AnimalsData {


     public static void AnimalsAction() {

          AnimalSpecs animal = new AnimalSpecs();
          Cat cat = new Cat();
          Dog dog = new Dog();

          animal.setVoice(dog.animalNoise());
          animal.setColor(dog.animalColor(dogColor));
          animal.setPrint(dog.print());
          animal.setVoice(cat.animalNoise());
          animal.setColor(cat.animalColor(catColor));
          animal.setPrint(cat.print());



     }

        }









