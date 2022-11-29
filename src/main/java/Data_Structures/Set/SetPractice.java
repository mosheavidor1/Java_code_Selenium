package Data_Structures.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {


    public static void main(String[] args) {


        Set<Integer> numbers = new HashSet<Integer>();
        Set<String> words = new TreeSet<>();


        numbers.add(1);
        numbers.add(5);
        numbers.add(6);
        numbers.add(9);
        numbers.addAll(Set.of(5, 3, 56, 66));

        words.add("moshe");
        words.add("Alex");
        words.add("77");


        System.out.println(numbers);
        System.out.println(words);


    }
}
