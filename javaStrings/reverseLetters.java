package javaStrings;

import java.util.*;

public class reverseLetters {
    public static StringBuilder reverseLetter(StringBuilder str) {
        int length = str.length();
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(length - 1);
        str.setCharAt(0, lastChar);
        str.setCharAt(length - 1, firstChar);
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        StringBuilder s = new StringBuilder(userInput);

        System.out.println(reverseLetter(s));
    }
}
