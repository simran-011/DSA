package Linklist;

class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean checkPallidrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step1 = mid
        Node mid = findMid(head);
        // step2 = reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev; // reverse
            prev = curr;
            curr = next;

        }

        Node right = mid;
        Node left = head;

        // step3 = data check for right and left
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public void addLast(int data) {
        // step1 --> creating a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 --> pointing a tail towards the newNode
        tail.next = newNode;

        // making the newNode tail
        tail = newNode;

    }
}

public class pallidrome {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
        // ll.addLast(3);
        System.out.println(ll.checkPallidrome());

    }
}
