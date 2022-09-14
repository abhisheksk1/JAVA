package com.abhi;

public class Main {
    public static void main(String[] args) {

        LinkdList list=new LinkdList();

        list.insertFirst(3);
        list.insertFirst(7);
        list.insertFirst(9);
        list.insertFirst(17);
        list.insertLast(19);
        list.insert(15, 4);

        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        list.insertRec(88,2);
        list.display();

        //DOUBLY LINKEDLIST
//        DoublyLinkedList list=new DoublyLinkedList();
//
//        list.insertFirst(3);
//        list.insertFirst(7);
//        list.insertLast(9);
//        list.insert(3,99);


        //CIRCULAR LINKEDLIST

//        CLL list=new CLL();
//
//        list.insert(3);
//        list.insert(4);
//        list.insert(6);
//        list.insert(9);
//        list.insert(2);
//        list.insert(7);
//
//        list.display();
//
//        list.delete(2);
//
//        list.display();
    }
}