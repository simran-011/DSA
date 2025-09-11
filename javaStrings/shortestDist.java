package javaStrings;

import java.util.*;

public class shortestDist {
    public static int shortestDist(String dir) {
        int x = 0, y = 0;
        for (int i = 0; i < dir.length(); i++) {
            if (dir.charAt(i) == 'N') {
                y++;
            } else if (dir.charAt(i) == 'S') {
                y--;
            } else if (dir.charAt(i) == 'W') {
                x--;
            } else if (dir.charAt(i) == 'E') {
                x++;
            }
        }
        double sd = (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return (int) sd;
    }

    public static void main(String[] args) {
        System.out.println(shortestDist("WNEENESENNN"));
    }
}
