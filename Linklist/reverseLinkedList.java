public class reverseLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        static Node head = null;
        static Node tail = null;

        public static void reverse(Node head, Node prev, Node next) {
            Node curr = head;
            if (curr == null) {
                Node.head = prev;

                return;
            }

            next = curr.next;
            curr.next = prev;

            reverse(next, curr, next);
        }

    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node.head = n1;
        Node.tail = n4;

        System.out.print("Original List: ");
        Node temp = Node.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        Node.reverse(Node.head, null, null);

        System.out.print("Original List: ");
        Node temp1 = Node.head;
        while (temp1 != null) {
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
        }

    }
}
