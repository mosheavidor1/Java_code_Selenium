package Data_Structures.List.LinkedList;


import java.util.LinkedList;

public class List_Linked {

        LinkedList<String> names = new LinkedList();

        public LinkedList<String> GetNames() {

            names.add("moshe");
            names.add("Alex");
            names.add("John");
            names.add("Danny");
            names.addFirst("Bob");
            names.addFirst("Chris");
            names.addLast("Jimmy");
            System.out.println(names);

            names.set(3, "Tower");
            System.out.println(names);

            names.add(4, "Shower");
            System.out.println(names);


            names.remove("moshe");
            System.out.println(names);

            System.out.println(names.contains("moshe"));
            System.out.println(names.contains("Chris"));

            System.out.println(names.indexOf("Danny"));


            return names;

        }
    }


