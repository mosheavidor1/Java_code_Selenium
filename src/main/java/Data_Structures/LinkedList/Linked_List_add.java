package Data_Structures.LinkedList;


import java.util.LinkedList;

public class Linked_List_add {
    public static void main(String[] args) {


        LinkedList<String> names = new LinkedList();

//  public LinkedList<String> GetNames(){

        names.add("moshe");
        names.add("Alex");
        names.add("John");
        names.add("Danny");
        names.addFirst("Bob");
        names.addFirst("Chris");
        names.addLast("Jimmy");
        names.set(3, "Tower");
        names.add(4, "Shower");


//        System.out.println(names.get(5));
//        System.out.println(names.size());
//        System.out.println(names.set(3, "Tower"));
//        System.out.println(names);
        names.remove("moshe");
        System.out.println(names);
        System.out.println(names.indexOf("Danny"));





//     return names;

    }
}

