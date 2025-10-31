package Linklist;

import java.util.*;

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

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node merge(Node leftHead, Node rightHead) {
        Node mergell = new Node(-1);
        Node temp = mergell;

        while (leftHead != null && rightHead != null) {
            if (leftHead.data < rightHead.data) {
                temp.next = leftHead;
                temp = temp.next;
                leftHead = leftHead.next;
            } else {
                temp.next = rightHead;
                rightHead = rightHead.next;
                temp = temp.next;
            }
        }

        while (leftHead != null) {
            temp.next = leftHead;
            temp = temp.next;
            leftHead = leftHead.next;
        }

        while (rightHead != null) {
            temp.next = rightHead;
            rightHead = rightHead.next;
            temp = temp.next;
        }

        return mergell.next;
    }

    public Node mergeSort(Node head) {
        // step1 -> finding the mid

        Node mid = findMid(head);

        // step2 -> separating left and right part
        Node rightHead = mid.next;
        mid.next = null;

        // step3 -> recursion
        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        // step4 -> merge calling for both the parts
        return merge(left, right);
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

}

public class merge {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();

        LinkedList.head = ll.mergeSort(LinkedList.head);
        ll.print();

    }
}
