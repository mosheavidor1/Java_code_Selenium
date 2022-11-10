package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Generic_WildCard {

    public static void main(String[] args) {

        List<String>A=new ArrayList<>();
        A.add("Moshe");
        A.add("Bob");
        A.add("Chris");

        printThis(A);
    }

    private static void printThis(List<?>my_list){

        System.out.println(my_list);


    }


}
