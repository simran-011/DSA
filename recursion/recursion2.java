package recursion;

public class recursion2 {
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static int friendsPair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int fnm1 = friendsPair(n - 1);
        int fnm2 = friendsPair(n - 2);
        int pairChoice = (n - 1) * fnm2;
        return fnm1 + pairChoice;
    }

    public static void printBinaryString(int n, int lastChar, String s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }

        printBinaryString(n - 1, 0, s + "0");
        if (lastChar == 0) {
            printBinaryString(n - 1, 1, s + "1");
        }
    }

    public static void main(String[] args) {
        // removeDuplicate("aaanya", 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(friendsPair(5));
        printBinaryString(4, 0, "");
    }
}
