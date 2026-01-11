package Linklist.doublell;

public class doublell {
    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // adding the first element
    public void addFirst(int data) {
        // creating a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // if the linkedList is not empty
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // printing the double linkedlist
    public void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("dll is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // removing first node
    public int removeFirst() {
        if (head == null) {
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }

        if (head.next == null) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;

        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev; // reverse
            curr.prev = next;

            prev = curr;
            curr = next;

        }

        head = prev;
    }

    public Node deleteNode(Node head) {
        if(head == null && head.next == null) {
            return null;
        }

        Node prevTemp = null;
        Node temp = head;
        while(temp.next != null) {
            prevTemp = temp;
            temp = temp.next;
        }

        prevTemp.next = null;
        temp.prev = null;

        return head;


    }

    public static void main(String[] args) {
        doublell dll = new doublell();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.print();
        dll.reverse();
        dll.print();

    }
}
