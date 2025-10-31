package Linklist;

import java.util.*;

import OOPS.interfaces;
import javaStrings.largestString;

public class LinkedList {
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

    public void addFirst(int data) {
        // step1 --> creating a new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 --> pointing the next towards the head
        newNode.next = head;

        // step 3 --> changing head to newNode

        head = newNode;

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

    public void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        // creating a temp node
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // adding at a particular index
    public void addAtIndex(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        // creating a new node
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // at a point where i==prev the idx
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // removing first element
    public int removeFirst() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;

        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // removing last element
    public int removeLast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    // iterator search for a key in linkedlist
    public int itrSerach(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // seraching for a key using recursion
    public int recKey(int key, Node head) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = recKey(key, head.next);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    // reverse a linkedlist
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev; // reverse
            prev = curr;
            curr = next;

        }
        head = prev;
        prev = tail;
    }

    // to delete nth node from end
    public void deleteNthFromEnd(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next;
            return;
        }

        Node prev = head;
        int i = 1;
        int toFind = sz - n;
        while (i < toFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

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

        Node right = prev;
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

    // detecting cycle in linkedlist
    public static boolean checkLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next; // increment of +2
            slow = slow.next; // increment of 1

            if (fast == slow) {
                return true; // loop exists

            }
        }
        return false;
    }

    // removing the loop from linkedlist

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        Boolean cycle = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next; // increment of +2
            slow = slow.next; // increment of 1

            if (fast == slow) {
                cycle = true;
                break;

            }
        }

        if (cycle == false) {
            return;
        }

        Node prev = null;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;

            fast = fast.next;

        }
        prev.next = null; // breaking the loop
    }

    public void zigZag() {
        // find the mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        Node mid = slow;

        // reverse the 2nd half

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextLeft;
        Node nextRight;
        while (left != null && right != null) {
            // arranging in zig zag fashion
            nextLeft = left.next;
            left.next = right;
            nextRight = right.next;
            right.next = nextLeft;

            // updation
            left = nextLeft;
            right = nextRight;

        }

        // alternate merge
    }

    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();

        // ll.addFirst(2);

        // ll.addFirst(1);

        // ll.addLast(3);

        // ll.addLast(4);
        // ll.addAtIndex(2, 9);

        // // ll.print();

        // LinkedList list = new LinkedList();
        // list.addLast(1);
        // list.addLast(2);
        // list.addLast(3);
        // list.addLast(4);
        // list.addLast(5);
        // list.print();
        // list.zigZag();
        // list.print();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // System.out.println(ll.recKey(9, head));
        // ll.reverse();
        // ll.print();

        // ll.deleteNthFromEnd(3);
        // ll.deleteNthFromEnd(4);
        // ll.print();
        // System.out.println(list.checkPallidrome());

        // linkedlist having a cycle
        // head = new Node(1);

        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp; // 1->2->3->1

        // System.out.println(checkLoop());
        // removeCycle();
        // System.out.println(checkLoop());

        LinkedList list1 = new LinkedList();
        head = new Node(1);
        head.next = new Node(2);
        Node temp = new Node(3);
        head.next.next = temp;

        LinkedList list2 = new LinkedList();

    }
}
