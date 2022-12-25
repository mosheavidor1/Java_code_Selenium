package Stream;

import InterviewPractice.Basic_Study.loops.Person;

import java.util.*;
import java.util.stream.Collectors;

public class PeopleStreamTest{

        public static void main(String[] args) {

                //On this Test Please look at all comments each one of them is a separate test for streaming
                //first example is not streaming but the regular way to do this :


//Searching by for loop on Two Lists (one of all the people and move it to female list - only females)
                List<PeopleList> people = getPeople();


List<PeopleList>females= new ArrayList<>();

for(PeopleList p:people ){
        if(p.getGender().equals(Gender.FEMALE)){
                females.add(p);
        }

}
                females.forEach(System.out::println);



//Using Stream Filter: //p is the name I gave for PeopleList class like in the example above. also now I'm using Lambda arrow on Stream.
//                List<PeopleList>females=people.stream().filter(p->p.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
//                females.forEach(System.out::println);

//Using Stream Sort:
                // List<PeopleList>sortedPeople=people.stream().sorted(Comparator.comparing(PeopleList::getAge)).collect(Collectors.toList());
                //with reversed - means that ages go from older to younger.
                // List<PeopleList>sortedPeople=people.stream().sorted(Comparator.comparing(PeopleList::getAge).reversed()).collect(Collectors.toList());
                // sortedPeople.forEach(System.out::println);


                //Using Stream allMatch:

//                boolean allMatch = people.stream().allMatch(p->p.getAge()>10);
//                System.out.println(allMatch);


//Using Stream noneMatch:

//       boolean noneMatch =people.stream().noneMatch(peopleList -> peopleList.getName().equals("Yoram"));
//                System.out.println(noneMatch);

                //Using Stream Max:
//
//                people.stream().max(Comparator.comparing(PeopleList::getAge)).ifPresent(System.out::println);


                //Using Stream Min:

//                people.stream().min(Comparator.comparing(PeopleList::getAge)).ifPresent(System.out::println);


                //Using Stream GroupBy: On this one we stream by one of the groups for example we can print all the group of Man and then the group of woman.
//                Map<Gender, List<PeopleList>> groupByGender = people.stream().collect(Collectors.groupingBy(PeopleList::getGender));
//using lambda in here for the Map above - Gender(Key) I called it gender and List<PeopleList> value I called it people1.
//                groupByGender.forEach((gender, people1) -> {
//                        System.out.println(gender);
//                      people1.forEach(System.out::println);
//                        System.out.println();

//  });



//Using filter for the oldest male for example I'm using Optional that in Java it means it will give me the result even if it is not exists null.

//Optional<String>oldestMaleAge=people.stream().filter(p->p.getGender().equals(Gender.MALE)).
//        max(Comparator.comparing(PeopleList::getAge)).map(PeopleList::getName);
//
//oldestMaleAge.ifPresent(System.out::println);

}




        private static List<PeopleList> getPeople(){

                return List.of(
                        new PeopleList("Moshe",39,Gender.MALE),
                        new PeopleList("Alex",20,Gender.FEMALE),
                        new PeopleList("Yoni",45,Gender.MALE),
                        new PeopleList("Tamar",43,Gender.FEMALE),
                        new PeopleList("Orit",30,Gender.FEMALE)
                );


                }
        }









