//package org.example.list;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class Solution {
//
//    int size=0;
//    Node head;
//
//    //itt nem foglalkozunk azzal, hogy az index nagyobb lehet stb
//    //csak letöröljük
//    void deleteAtIndex(int index){
//        if(head==null) System.out.println("nothing to delete list is empty");
//        else if(index>=size){
//            System.out.println("you cannot delete at that posotion");
//        }
//        else if(index==0){
//            deleteFromFront();
//        }
//        else{
//            Node fast = head.next;
//            Node slow = head;
//            int counter = 1;
//            while(fast!=null&&counter<index){
//
//                slow = fast;
//                fast= fast.next;
//                counter++;
//            }
//            slow.next = fast.next;
//            size--;
//        }
//
//    }
//
//    void deleteFromEnd(){
//        if(head==null) System.out.println("the list is empty");
//        else if(size==1){
//            System.out.println("last item has been deleted");
//            head = null;
//        }
//        else{
//            Node slow = head;
//            Node current = head;
//            while(current.next!=null){
//                slow =current;
//                current = current.next;
//            }
//            slow.next = null;
//        }
//        size--;
//    }
//
//    void deleteFromFront(){
//        if(head==null) System.out.println("the list is empty");
//        else if(size==1){
//            System.out.println("last item has been deleted");
//            head = null;
//        }
//        else{
//            head = head.next;
//        }
//        size--;
//    }
//
//
//
//    void addAtIndex(int index,int data){
//        if(index+1>size||index<0){
//            System.out.println("it is not possible to add to that index: "+index);
//        }
//        else if(index==0){
//            addToHead(data);
//            size++;
//        }
//        else{
//            Node fast = head;
//            Node slow = head;
//            Node node = new Node(data);
//            int counter=1;
//            while(fast!=null&& counter<=index){
//                slow =fast;
//                fast = fast.next;
//                counter++;
//            }
//            slow.next = node;
//            node.next = fast;
//            size++;
//        }
//    }
//
//    void addToEnd(int val){
//        Node node = new Node(val);
//        if(head==null){
//            head = node;
//            head.next = null;
//
//        }
//        else{
//            Node current = head;
//            while(current.next!=null){
//                current = current.next;
//            }
//            current.next = node;
//
//        }
//        size++;
//    }
//
//    void addToHead(int data){
//        Node node = new Node(data);
//        if(head==null) head=node;
//        else{
//            Node old = head;
//            head = node;
//            head.next = old;
//        }
//        size++;
//    }
//
//    int getElementByIndex(int index){
//        Node current = head;
//        int counter =0;
//        while(current.next!=null && counter<index){
//            current = current.next;
//            counter++;
//        }
//        return current.val;
//
//    }
//
//
//
//
//
//    void removeDuplicates2(){
//        Set<Integer> container = new HashSet<>();
//        Node current = head.next;
//        Node previous = head;
//        container.add(head.val);
//
//        while(current.next != null){
//            if(container.contains(current.val)){
//                //eltávolitjuk az adott element a linkedlistből
//                previous.next = current.next;
//            }
//            else{
//                container.add(current.val);
//            }
//            previous = previous.next;
//            current = current.next;
//        }
//        if(container.contains(current.val)){
//            //eltávolítjuk
//            previous.next =null;
//        }
//    }
//    //working one
//    //comes from leetcode solutions by somebody
//    //it removes all the not single ones
//    void removeDuplicates(){
//        Node temp = head;
//        while ( temp.next != null) {
//            if (temp.val == temp.next.val ) {
//                temp.next = temp.next.next;
//                size--;
//            }
//            else {
//                temp = temp.next;
//            }
//        }
//    }
//
//    void printOut(){
//        if(head==null) System.out.println("the list is empty");
//        else{
//            Node current = head;
//            while(current.next!=null){
//                System.out.println(current.val);
//                current = current.next;
//            }
//            System.out.println(current.val);
//        }
//    }
//}
