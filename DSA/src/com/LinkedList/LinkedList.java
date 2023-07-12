package com.LinkedList;

class Node{
    int data;
    Node next;
    Node(int n){
        data=n;
        next=null;
    }
}

public class LinkedList {

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            if(temp.next == null){
                System.out.print(temp.data);
                System.out.println();
                return;
            }
            else {
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }

        }
        System.out.println();
    }

    public static Node insertStart(Node head,int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
        return head;
    }

    public static void insertLast(Node head,int data){

        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return ;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return ;
    }

    public static void insertMiddle(int pos,int data,Node head){
        int size = calcSize(head);
        if(pos<1 || size<pos){
            System.out.println("Insertion is not possible");
        }
        else{
            Node newNode = new Node(data);
            Node temp = head;
            pos = pos-1;
            while(--pos>0){
                temp = temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }

    public static void delete(Node head,int value){
        Node temp = head;
        Node previous = null;
        if(temp.next==null){
            head = null;
            return;
        }
        if(temp.next!=null && temp.data==value){
            head = temp.next;
            return;
        }
        while (temp!=null && temp.data!=value){
            previous=temp;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("value not found");
            return;
        }
        previous.next=temp.next;
        return;
    }

    public static int calcSize(Node head){
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }

    public static void main(String[] args) {
        Node head=null;
        head = insertStart(head,12);
        head = insertStart(head,13);
        head = insertStart(head,14);
        display(head);
        insertLast(head,1);
        insertLast(head,2);
        insertLast(head,3);
        display(head);
        insertMiddle(2,5,head);
        display(head);
        delete(head,13);
        display(head);
        delete(head,3);
        display(head);
    }
}
