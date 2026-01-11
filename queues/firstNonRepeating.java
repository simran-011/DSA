import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class firstNonRepeating {
    public static void firstNonRepeat(String str) {
        HashMap<Character, Integer> m = new HashMap<>();
        char val = 'a';
        for (int i = 0; i < 26; i++) {
            m.put(val, 0);
            val++;
        }

        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            m.put(ch, m.getOrDefault(ch, 0) + 1);
            while (!q.isEmpty() && m.get(q.peek()) > 1) {
                q.poll();
            }

            if (q.isEmpty()) {
                System.out.println("-1");

            } else {
                System.out.println(q.peek());
            }

        }
    }

    public static void qReversal(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        qReversal(q);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
