package com.DoubleLinkedList;

class Node_{
    int data;
    Node_ next;
    Node_ prev;
    Node_(int x){
        data=x;
        next=null;
        prev=null;
    }
}
public class DoubleLinkedList {

    public static Node_ insertStart(Node_ head,int data){
        Node_ newNode = new Node_(data);
        newNode.next=head;
        newNode.prev=null;
        if(head!=null){
            head.prev=newNode;
        }
        head = newNode;
        return head;
    }

    public static void insertLast(Node_ head,int data){
        Node_ temp = head;
        Node_ newNode = new Node_(data);
        newNode.next=null;
        if(head==null){
            head=newNode;
            newNode.prev=null;
            return;
        }
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        return;
    }

    public static void insertMiddle(Node_ head,int data,int pos){
        Node_ temp=head;
        int Size = calcSize(head);
        if(pos<1 || Size<pos){
            System.out.println("Insertion not possible");
            return;
        }
        else{
            Node_ newNode = new Node_(data);
            while(--pos>0){
                temp = temp.next;
            }
            temp.next.prev=newNode;
            newNode.next = temp.next;
            newNode.prev=temp;
            temp.next=newNode;
            return;
        }
    }

    public static int calcSize(Node_ head){
        Node_ temp = head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }

    public static void delete(Node_ head,int delVal){
        Node_ temp = head;
        Node_ previous = null;
        if(temp.next==null){
            head=null;
            return;
        }
        while(temp.next!=null && temp.data==delVal){
            head = temp.next;
            head.prev=null;
            return;
        }
        while(temp.next!=null && temp.data!=delVal){
            previous=temp;
            temp=temp.next;
        }
        //?
        if(temp==null){
            System.out.println("Not found");
            return;
        }
        previous.next=temp.next; //?
        temp.next.prev=previous;
    }

    public static void display(Node_ head,int input){
        Node_ temp=head;
        Node_ end=null;

        switch (input){
            case 1:
                System.out.println("Front - Back");
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    end=temp;
                    temp=temp.next;
                }
                System.out.println();
                break;

            case 2:
                while(temp!=null){
                    end=temp;
                    temp=temp.next;
                }
                System.out.println("Back-Front");
                while(end!=null){
                    System.out.print(end.data+" ");
                    temp = end;
                    end = end.prev;
                }
                System.out.println();
                break;
        }
        return;
    }

    public static void main(String[] args) {
        Node_ head = null;
        head = insertStart(head,12);
        head = insertStart(head,13);
        head = insertStart(head,14);
        head = insertStart(head,15);
        head = insertStart(head,16);
        head = insertStart(head,17);
        display(head,1);
        insertLast(head,1);
        insertLast(head,2);
        insertLast(head,3);
        insertLast(head,4);
        insertLast(head,5);
        insertLast(head,6);
        display(head,1);
        delete(head,3);
        display(head,1);
        insertMiddle(head,45,3);
        display(head,1);
        display(head,2);
    }
}
