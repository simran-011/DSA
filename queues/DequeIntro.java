import java.util.*;

public class DequeIntro {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1); // 1
        dq.addFirst(2); // 2 1

        dq.addLast(4); // 2 1 4
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);

    }
}
