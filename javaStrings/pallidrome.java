package javaStrings;

import java.util.*;

public class pallidrome {
    public static boolean isPallidrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = isPallidrome("racecap");
        System.out.println(result);
    }
}
