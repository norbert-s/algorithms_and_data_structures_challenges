package org.example.list;

public class Main {
    public static void main(String[]args){
        LinkedList list = new LinkedList();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        list.addToHead(4);
        list.addToHead(5);
        list.addToHead(6);
//        list.addAtIndex(0,10);
//        list.addAtIndex(1,100);
//        list.addAtIndex(2,1000);
        //list.printOut();
        //Node prev = list.reverseLinkedList(list);
//        Node head = list.returnNthNodeFromEnd(list.head,6);
//        System.out.println(head.data);
        //list.printOut(head);
        Node prev = list.removeNthNodeFromEnd(list.head,6);
        list.printOut(prev);
    }

    public static LinkedList insertionSortLinkedList(LinkedList list){
        


        return list;
    }
}
