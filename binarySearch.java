import java.util.*;

public class binarySearch {
    public static void binarySearch2D(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0, end = m - 1;

        while (start < n && end >= 0) {
            int foundKey = matrix[start][end];
            if (key == foundKey) {
                System.out.println(" start: " + start + " end: " + end);
                return;
            } else if (key > foundKey) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println("this key doesn't exist in this matrix ");
        return;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        binarySearch2D(matrix, 33);
    }
}
