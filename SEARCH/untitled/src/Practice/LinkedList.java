package Practice;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class LinkedList {
    public Node insertFirst(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public void insertLast(Node head, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int calcSize(Node head) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    public void insertMiddle(Node head, int pos, int data) {
        Node newNode = new Node(data);
        int size = calcSize(head);
        if (pos < 1 || pos > size) {
            System.out.println("Insertion Not Possible");
        } else {
            Node temp = head;
            pos = pos - 1;
            while (--pos > 0) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node delete(Node head, int data) {
        Node temp = head;
        Node prev = null;
        if (temp.next == null) {
            head = null;
            return head ;
        }
        if (temp!=null && temp.data == data) {
            head = temp.next;
            return head;
        }

        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Not Found");
        }
        prev.next = temp.next;
        return head;
    }

//    public void deletePos(Node head, int pos) {
//        Node temp = head;
//        Node prev = head;
//        if (temp.next == null) {
//            head = null;
//            return;
//        }
//        if (pos==1) {
//            temp=temp.next.next;
//            System.out.println(true);
//            return;
//        } else if (pos < 1 || pos > calcSize(head)) {
//            System.out.println("Not found");
//        } else{
//             pos = pos-1;
//            while (--pos > 0) {
//                prev = temp;
//                temp = temp.next;
//            }
//            if (temp == null) {
//                System.out.println("Not Found");
//            }
//            temp.next = temp.next.next;
//            return;
//        }
//    }
}
