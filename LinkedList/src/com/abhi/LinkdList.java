package com.abhi;

public class LinkdList {
    private Node head;
    private Node tail;
    private int size;

    public LinkdList(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }

        size += 1;
    }

    public void insertLast(int val){
        Node node=new Node(val);
        if(tail==null){
            insertFirst(val);
            return;
        }
        tail.next=node;
        tail=node;

        size++;
    }

    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1; i<index; i++){
            temp=temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next=node;
        size++;
    }

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return val;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;
    }

    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0; i<index; i++){
            node=node.next;
        }
        return node;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    //insert using recursion
    public void insertRec(int val, int index){
        head=insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index==0){
            Node temp=new Node(val, node);
            size++;
            return temp;
        }
        node.next=insertRec(val, index-1, node.next);
        return node;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }

    //QUESTION 1: Remove duplicates from sorted list
    public void duplicates(){
        Node node=head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }else{
                node=node.next;
            }
        }
        tail=node;
        tail=null;
    }

    //QUESTION 2: Merge two sorted Linked list
    public Node sortedTwoList(Node list1, Node list2){
        Node current=head;
        Node temp1=list1;
        Node temp2=list2;

        if(temp1.value<=temp2.value){
            head=temp1;
            current=temp1;
            temp1=temp1.next;
        }else{
            head=temp2;
            current=temp2;
            temp2=temp2.next;
        }
        while(temp1!=null && temp2!=null){
            if(temp1.value<=temp2.value){
                current.next=temp1;
                current=current.next;
                temp1=temp1.next;
            }else{
                current.next=temp2;
                current=current.next;
                temp2=temp2.next;
            }
        }
        while(temp1!=null){
            current.next=temp1;
            current=current.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            current.next=temp2;
            current=current.next;
            temp2=temp2.next;
        }
        return head;
    }

    //QUESTION 3: Linked List Cycle-1
    public boolean LinkedListCycle(){
        Node fast=head;
        Node slow=head;

        while(slow!=null && fast!=null && slow.next!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }

        return false;
    }

    //QUESTION 4: Length of Linked List Cycle
    public int LengthOfLinkedListCycle(Node head){
        Node fast=head;
        Node slow=head;

        while(slow!=null && fast!=null && slow.next!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                Node temp=slow;
                int length=0;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }

        return 0;
    }

    //QUESTION 5: Detect the LinkedList Cycle
    public Node detectCycle(){
        int length=0;
        Node fast=head;
        Node slow=head;
        while(slow!=null && fast!=null && slow.next!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                length=LengthOfLinkedListCycle(slow);
                break;
            }
        }

        //Find the start node;
        Node first=head;
        Node second=head;
        while(length>0){
            second=second.next;
            length--;
        }

        //Keep moving both forward they will meet at start cycle;
        while(first!=second){
            first=first.next;
            second=second.next;
        }

        return second;
    }

    //QUESTION 6: Happy Number
    public boolean happy(int n){
        int slow=n;
        int fast=n;

        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while(fast!=slow);

        if(slow==1)
            return true;

        return false;
    }
    private int findSquare(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans+=rem*rem;
            num/=num;
        }
        return ans;
    }

    //QUESTION 7: Middle of the Linked List
    public Node middleNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
