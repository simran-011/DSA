package recursion;

import java.util.Scanner;

public class problems {
    // print numbers till n in descending order
    public static void printDecNo(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecNo(n - 1);
    }

    // print numbers till n in ascending order
    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printInc(n - 1);
        System.out.println(n);

    }

    // factorial of a number
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fNm1 = factorial(n - 1);
        int fN = n * fNm1;
        return fN;
    }

    // sum of n natural numbers
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int s = n + sum(n - 1);
        return s;
    }

    // factorial of a number

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int f = fibo(n - 1) + fibo(n - 2);
        return f;
    }

    // 1st occurrence of the a number in the array
    public static int firstOcc(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOcc(arr, key, i + 1);
    }

    // to check if the array is sorted in ascending order
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        boolean s = isSorted(arr, i + 1);
        return s;
    }

    // to check the last occurrence of any key
    public static int lastOccur(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }

        int isFound = lastOccur(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    // x^n calculation using recursion
    public static int raisePow(int base, int power) {
        if (power == 0) {
            return 1;
        }
        int pow = raisePow(base, power - 1);
        return base * pow;
    }

    // x^n calculation using recursion with optimized time complexity
    public static int raisePower(int base, int power) {
        if (power == 0) {
            return 1;
        }
        int pow = raisePower(base, power / 2) * raisePower(base, power / 2);
        // if the power is odd
        if (power % 2 != 0) {
            pow = base * pow;
        }
        return pow;
    }

    public static void main(String[] args) {
        // printDecNo(5);
        // printInc(5);
        // System.out.println(sum(5));
        // System.out.println(fibo(6));
        // Scanner sc = new Scanner(System.in);
        // int arr[] = new int[4];
        // for (int i = 0; i < 4; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println(isSorted(arr, 0));

        // int arr[] = { 23, 78, 56, 120, 100 };
        // System.out.println(lastOccur(arr, 78, 0));

        // System.out.println(raisePow(2, 10));
        System.out.println(raisePower(2, 5));
    }
}
