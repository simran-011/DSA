package javaStrings;

import java.util.*;

public class stringCompression {
    public static StringBuilder stringComp(String str) {
        StringBuilder s = new StringBuilder(" ");
        for (int i = 0; i < str.length(); i++) {

            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {
                s.append(str.charAt(i));
                s.append(count.toString());

            } else if (count == 1) {
                s.append(str.charAt(i));
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.print(stringComp("abcd"));
    }
}
