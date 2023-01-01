package Data_Structures.List.LinkedList.ReverseDouble;

import java.util.LinkedList;

public class DoublyLinkedList {

    LinkedList<Integer> data;
    DoublyLinkedList next;
    DoublyLinkedList prev;

    public DoublyLinkedList reverse(DoublyLinkedList head,LinkedList<Integer> rev){



        if(head==null) return head;

        DoublyLinkedList current_node=head;
        DoublyLinkedList new_head=head;

        while (current_node!=null){
            DoublyLinkedList prev=current_node.prev;
            current_node.prev=current_node.next;
            current_node.next=prev;
            new_head =current_node;
            current_node=current_node.prev;


        }

        return new_head;

    }




}



////This List is double Linked List and this process will reverse it
////look at https://www.youtube.com/watch?v=vsETk6ypwFI
////1<->2<->3<->4<->5  (Before)
////5<->4<->3<->2<->1  (After)  each number swapping place with the one next to it till last number 5 is in the beginning
////and 1 is int the end .