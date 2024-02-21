package org.example.list;

public class LinkedList {
    Node head;
    int size;

    void insertAtIndex(int index, int data){
        if(head==null && index ==0){
            head = new Node(data);
        }
        else if( head==null && index!=0){
            System.out.println("list is empty");
        }
        else if(index==0){
            Node old = head;
            head = new Node(data);
            head.next = old;
        }
        else{
            System.out.println("itt");
            int counter = 1;
            Node slow = head;
            Node fast = head;
            while(fast!=null&&counter<index){
                slow =fast;
                fast = fast.next;
                counter++;
            }
            Node old = fast;
            slow.next = new Node(data);
            slow.next.next = old;

        }
    }
    void addAtIndex(int index,int data){
        if(index+1>size||index<0){
            System.out.println("it is not possible to add to that index: "+index);
        }
        else if(index==0){
            addToHead(data);
            size++;
        }
        else{
            Node fast = head;
            Node slow = head;
            Node node = new Node(data);
            int counter=1;
            while(fast!=null&& counter<=index){
                slow =fast;
                fast = fast.next;
                counter++;
            }
            slow.next = node;
            node.next = fast;
            size++;
        }
    }

//    Node reverseLinkedList(LinkedList list){
//        if(list.head==null) System.out.println("list is empty");
//        else if(size==1) System.out.println("size is only 1 nothing to reverse");
//        else if (size==2){
//            Node newCurrent = list.head.next;
//            head.next = head;
//            head = newCurrent;
//        }
//        else{
//            Node previous = head;
//            Node slow = head;
//            Node fast = list.head.next;
//            while(fast!=null){
//                System.out.println(previous.data);
//                slow.next = previous;
//                previous = slow;
//                slow = fast;
//                fast = fast.next;
//            }
//            return slow;
//        }
//        return null;
//    }

    Node reverseLinkedList(LinkedList list){
        Node prev = null;
        Node curr = list.head;
        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    Node returnNthNodeFromEnd(Node head,int nthIndex){
        //todo reverse linked list, then step nth times back
        Node current = head;
        Node previous = null;

        while(current!=null){
            Node oldNext =current.next ; // ez mivel egyenlő
            current.next = previous;
            previous = current;
            current = oldNext;
        }
        int counter=1;
        Node newCurrent =previous;
        while(newCurrent.next!=null&&counter!=nthIndex){
            newCurrent = newCurrent.next;
            counter++;
        }
        return newCurrent;
    }
    Node removeNthNodeFromEnd(Node head,int n){
        //todo reverse linked list, then step nth times back
        Node current = head;
        Node previous = null;

        while(current!=null){
            Node oldNext =current.next ; // ez mivel egyenlő
            current.next = previous;
            previous = current;
            current = oldNext;
        }


        //todo ------------------------------------------------------
        int counter=1;
        Node slow =previous;
        Node fast = slow.next;
        if(n==1) return slow.next;
        while(fast.next!=null&&counter+1<n){
            System.out.println("itt");
            slow = fast;
            fast = fast.next;
            counter++;
        }
        slow.next = fast.next;
        return previous;
    }



    void addToHead(int data){
        if(head==null){
            head = new Node(data);
            size++;
        }
        else{
            Node old = head;
            head = new Node(data);
            head.next = old;
            size++;
        }
    }
    void printOut(Node head){
        if(head==null) System.out.println("list is empty");
        else{
            Node current = head;
            while(current.next!=null){
                System.out.println(current.data);
                current = current.next;
            }
            System.out.println(current.data);
        }
    }

    void printOut(){
        if(head==null) System.out.println("list is empty");
        else{
            Node current = head;
            while(current.next!=null){
                System.out.println(current.data);
                current = current.next;
            }
            System.out.println(current.data);
        }
    }
}