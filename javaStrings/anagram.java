package javaStrings;

import java.util.*;

public class anagram {
    public static boolean isAnagram(String str, String str1) {
        if (str.length() != str1.length()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            int isAnagram = 0;
            for (int j = 0; j < str1.length(); j++) {
                if (str.charAt(i) == str1.charAt(j)) {
                    isAnagram = 1;
                }
            }
            if (isAnagram == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("abcd", "listen"));
    }
}
