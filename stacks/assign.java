import java.util.*;

public class assign {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    static Node head = null;

    public static Boolean checkPalli(Node head) {
        Node temp = head;

        Stack<Integer> s = new Stack<>();
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            int curr = s.peek();
            if (curr != temp.data) {
                return false;
            }
            temp = temp.next;
            s.pop();
        }
        return true;

    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        // Node n4 = new Node(2);
        // Node n5 = new Node(1);
        n1.next = n2;
        n2.next = n3;
        // n3.next = n4;
        // n4.next = n5;

        System.out.println(checkPalli(n1));

    }
}
