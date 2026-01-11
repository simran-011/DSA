import java.util.*;

public class Deque2 {
    static class Stack {
        static Deque<Integer> dq = new LinkedList<>();

        public static boolean isEmpty() {
            if (dq.peekFirst() == null && dq.peekLast() == null) {
                return true;
            }
            return false;
        }

        public static void push(int data) {
            dq.addLast(data);
        }

        public static int pop() {
            return dq.removeLast();
        }

        public static int peek() {
            return dq.getLast();
        }
    }

    static class Queue {
        static Deque<Integer> dq = new LinkedList<>();

        public static boolean isEmpty() {
            if (dq.peekFirst() == null && dq.peekLast() == null) {
                return true;
            }
            return false;
        }

        public static void add(int data) {
            dq.addLast(data);
        }

        public static int remove() {
            return dq.removeFirst();
        }

        public static int peek() {
            return dq.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
