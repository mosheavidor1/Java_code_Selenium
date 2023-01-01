package Data_Structures.List.LinkedList.BasicLoop;



import java.util.*;

public class List_Linked {

    LinkedList<String> names = new LinkedList<String>();

    public String GetNames() {

        names.add("moshe");
        names.add("Alex");
        names.add("John");
        names.add("Danny");
        names.addFirst("Bob");
        names.addFirst("Chris");
        names.addLast("Jimmy");




       ListIterator<String>iterator= names.listIterator();

        if(iterator.hasNext()){
            iterator.next();
            iterator.add("Moshiko");

        }
        for(String i:names){
            System.out.println(i+" ");

        }





return iterator.next();

    }
}






