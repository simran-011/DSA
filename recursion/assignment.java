
import java.util.*;

public class assignment {
    public static void keyOccurrence(int arr[], int idx, int key) {
        if (idx == arr.length) {
            return;
        }

        if (arr[idx] == key) {
            System.out.print(idx + " ");

        }

        keyOccurrence(arr, idx + 1, key);
    }

    public static void convertStr(int n, int idx) {
        // Integer i = new Integer(n);
        // String s = i.toString();

        String s = Integer.toString(n);

        if (idx == s.length()) {
            return;
        }

        char sIdx = s.charAt(idx);
        switch (sIdx) {
            case '0':
                System.out.print("zero" + " ");
                break;
            case '1':
                System.out.print("one" + " ");
                break;
            case '2':
                System.out.print("two" + " ");
                break;
            case '3':
                System.out.print("three" + " ");
                break;
            case '4':
                System.out.print("four" + " ");
                break;
            case '5':
                System.out.print("five" + " ");
                break;
            case '6':
                System.out.print("six" + " ");
                break;
            case '7':
                System.out.print("seven" + " ");
                break;
            case '8':
                System.out.print("eight" + " ");
                break;
            case '9':
                System.out.print("nine" + " ");
                break;

            default:
                break;
        }
        convertStr(n, idx + 1);
    }

    public static void sameEndString(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String subStr = str.substring(i, j + 1);
                if (subStr.charAt(0) == subStr.charAt(subStr.length() - 1)) {

                    System.out.println(subStr);
                }
            }
        }
    }

    public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }

        int len = length(str.substring(1));
        return len + 1;
    }

    public static void main(String[] args) {
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // keyOccurrence(arr, 0, 2);
        // int number = 5678;
        // convertStr(number, 0);
        // System.out.println(length("abc"));
        sameEndString("abcab");
    }
}
