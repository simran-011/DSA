package javaStrings;

import java.util.*;

public class capsWord {
    public static void printString(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }

    }

    public static void capitalWord(String str) {
        StringBuilder s = new StringBuilder("");
        s.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                s.append(" ");
                s.append(Character.toUpperCase(str.charAt(i + 1)));
                i++;
            } else {
                s.append(str.charAt(i));
            }
        }
        printString(s);

    }

    public static void main(String[] args) {
        capitalWord("simran anand");
    }
}
