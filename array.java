import java.util.*;

public class array {
    // its taking the sum of second row ele
    public static int sum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    // rotating an array from the given index
    public static void rotateArr(int arr[], int idx) {
        int n = arr.length;
        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = last;
    }

    // printing an array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // reverse an array
    public static void reverseArr(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }

    // max sum using brute force approach
    public static int maxSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }
                maxSum = Math.max(sum, maxSum);

            }
        }
        return maxSum;
    }

    // max-profit in buying stocks
    public static int maxProfit(int prices[]) {
        int bp = prices[0];
        int maxProfit = 0;
        int i = 1;
        while (i < prices.length) {
            if (bp < prices[i]) {
                int profit = prices[i] - bp;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                bp = prices[i];
            }
            i++;

        }
        return maxProfit;
    }

    // bubble sort for descending order
    public static void bubbleSort(int arr[]) {
        int n = arr.length - 1;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // selection sort in descending order
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[minPos]) {
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements for the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);
        printArr(arr);

    }
}
