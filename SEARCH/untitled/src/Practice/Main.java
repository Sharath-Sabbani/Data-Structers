package Practice;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Node head = null;
        head=ll.insertFirst(head,34);
        head=ll.insertFirst(head,33);
        head=ll.insertFirst(head,32);
        head=ll.insertFirst(head,31);
        head=ll.insertFirst(head,30);
        head=ll.insertFirst(head,29);

        ll.insertLast(head,35);
        ll.insertLast(head,36);
        ll.insertLast(head,37);
        ll.insertMiddle(head,2,100);
        ll.insertMiddle(head,4,200);
//        ll.delete(head , 37);
        ll.print(head);
        ll.delete(head,29);
//        ll.print(head);
        ll.print(head);
    }
}




