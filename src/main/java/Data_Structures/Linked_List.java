package Data_Structures;


import java.util.LinkedList;

public class Linked_List {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList();
        names.add("moshe");
        names.add("Alex");
        names.add("John");
        names.add("Danny");

        System.out.println(names.get(2));

    }
}
