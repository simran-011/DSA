package bactracking;

import java.util.*;

import javaStrings.largestString;

public class input {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("enter age");
        int age = sc.nextInt();
        // System.out.println("enter name");
        // sc.nextLine();
        // int num = sc.nextInt();
        // System.out.println(num + 1 + "<= My number");

        // int[] a = { 11, 33, 44, 55, 18, 77, 88 };
        // int key = 6;
        // int result = linearSearch(a, key);
        // System.out.println(result);

    }
}
