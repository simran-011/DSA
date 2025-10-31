import java.util.*;

public class problem {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseStr(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            st.push(s.charAt(i));
            i++;
        }

        StringBuilder sb = new StringBuilder("");
        while (!st.isEmpty()) {
            char ch = st.pop();
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);

    }

    public static void printStack(Stack<Integer> s) {
        System.out.println("-----stack-----");
        while (!s.isEmpty()) {
            System.out.println("| " + s.peek() + " |");
            s.pop();
        }

    }

    // stock span code
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> stockIdx = new Stack<>();
        span[0] = 1;
        stockIdx.push(0);
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!stockIdx.isEmpty() && stocks[stockIdx.peek()] < currPrice) {
                stockIdx.pop();
            }

            if (stockIdx.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = stockIdx.peek();
                span[i] = i - prevHigh;

            }
            stockIdx.push(i);

        }
    }

    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];

        stockSpan(stocks, span);
        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i] + " ");
        }

    }
}
