package Data_Structures.List.LinkedList.ReverseDouble;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        DoublyLinkedList list =new DoublyLinkedList();

        LinkedList<Integer> data = new LinkedList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);

        System.out.println(list.reverse(list.prev, data));

    }
}
