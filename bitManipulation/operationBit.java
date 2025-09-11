package bitManipulation;

import java.util.*;

public class operationBit {
    public static int getIthBit(int n, int i) {
        return n & (1 << i);
    }

    public static int setIthBit(int n, int i) {
        return n | (1 << i);
    }

    public static int clearIthBit(int n, int i) {
        return n & ~(1 << i);
    }

    public static int updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int bit = newBit << i;

        return n | bit;
    }

    public static int clearIBits(int n, int i) {
        int bit = (-1) << i;
        return n & bit;
    }

    public static int clearInRange(int n, int i, int j) {
        int a = (-1) << j + 1;
        int b = (1 << i) - 1;
        int c = a | b;
        return n & c;
    }

    public static boolean isPowerOf2(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        // System.out.println(clearIBits(15, 2));
        // System.out.println((-1) >> 2);
        // System.out.println(clearInRange(10, 2, 4));
        System.out.println(isPowerOf2(4));
    }
}
