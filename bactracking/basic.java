package bactracking;

public class basic {
    public static void trackArr(int arr[], int si) {
        if (si == arr.length) {
            return;
        }

        arr[si] = si + 1;
        trackArr(arr, si + 1);
        arr[si] = arr[si] - 2; // backtracking
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void stringStr(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }

            return;

        }

        // if the char says yes
        stringStr(str, ans + str.charAt(i), i + 1);

        // if the char says no
        stringStr(str, ans, i + 1);
    }

    public static void permutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutations(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        // int arr[] = new int[5];
        // trackArr(arr, 0);
        // printArr(arr);

        // stringStr("abc", "", 0);
        permutations("abc", "");

    }
}
