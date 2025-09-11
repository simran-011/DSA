package bitManipulation;

import java.util.*;

public class fastExp {
    public static int fastExp(int base, int power) {
        int ans = 1;
        while (power > 0) {
            if ((power & 1) != 0) {
                ans = ans * base;
            }
            base = base * base;
            power = power >> 1;
        }
        return ans;

    }

    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }

    public static void main(String[] args) {
        swap(2, 3);
    }
}
