package Linklist;

public class assign1 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node intersection(Node head1, Node head2) {
        Node i = head1;
        Node j = head2;
        while (i != null) {
            j = head2;
            while (j != null) {
                if (i == j) {
                    return j;
                }
                j = j.next;
            }
            i = i.next;
        }
        return null;

    }

    public static void main(String[] args) {
        assign1 a = new assign1();
        Node head1, head2;
        head1 = new Node(4);
        head2 = new Node(1);

        Node newNode = new Node(2);
        head2.next = newNode;
        newNode = new Node(3);
        head2.next.next = newNode;
        newNode = new Node(5);
        head1.next = newNode;
        newNode = new Node(6); // intersecting node
        head2.next.next.next = newNode;
        head1.next.next = newNode;
        newNode = new Node(7);
        head1.next.next.next = newNode;
        head1.next.next.next.next = null;

        Node result = a.intersection(head1, head2);
        if (result != null) {
            System.out.println("intersecting node has been found " + result.data);
        } else {
            System.out.println("node has not been found");
        }

    }
}
