import java.util.*;

public class duplicateParentheses {

    public static Boolean isDuplicateParent(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            if (ch != ')') {
                st.push(ch);

            } else if (!st.isEmpty() && ch == ')') {
                while (st.peek() != '(') {
                    st.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    st.pop();
                }

            }

        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a))";
        System.out.println(isDuplicateParent(str));
    }
}
