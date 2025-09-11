package divideAndConquer;

public class sortedAndRotated {
    public static int search(int arr[], int target, int si, int ei) {
        // base case if we haven't found the target
        if (si > ei) {
            return -1;
        }
        int midIdx = si + (ei - si) / 2;
        if (arr[midIdx] == target) {
            return midIdx;
        }
        // mid on 1st line
        if (arr[si] <= arr[midIdx]) {
            // left part of 1st line
            if (arr[si] <= target && target <= arr[midIdx]) {
                return search(arr, target, si, midIdx - 1);
                // on the rest of right part of 1st line
            } else {
                return search(arr, target, midIdx + 1, ei);
            }
        }

        // mid on second line
        else {
            // on the right part of 2nd line
            if (arr[midIdx] <= target && target <= arr[ei]) {
                return search(arr, target, midIdx + 1, ei);
            } else {
                // on the rest of the left part of the 2nd line
                return search(arr, target, si, midIdx - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(arr, 5, 0, 6));
    }
}
