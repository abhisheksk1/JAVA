package com.abhi;

public class DoublyLinkedList {

    Node head;

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }

    public void insertLast(int val){
        Node node=new Node(val);
        Node last=head;

        node.next=null;

        if(head==null){
            node.prev=null;
            head=node;
            return;
        }

        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }
    public void insert(int after, int val){
        Node p=find(after);
        if(p==null){
            System.out.println("It's doesn't exist.");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        node.prev=p;
        p.next=node;
        if(node.next!=null){
            node.next.prev=node;
        }
    }

    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.val==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.val+" -> ");
            last=node;
            node=node.next;
        }
        System.out.println("END");
        System.out.println("Print in reverse order:- ");
        while(last!=null){
            System.out.print(last.val+" -> ");
            last=last.prev;
        }
        System.out.println("START");
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val=val;
        }

        public Node(int val, Node next, Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
}
