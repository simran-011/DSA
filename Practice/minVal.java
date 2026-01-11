public class minVal {
    public static long findMin(int n, int m, int arr[][]) {
        int res[] = new int[n];
        int i = 0;
        while (i < m) {
            int a = 0, b = 0, k = 0;
            int j = 0;
            while (j < 3) {
                a = arr[i][j];
                j++;
                b = arr[i][j];
                j++;
                k = arr[i][j];
                j++;
            }
            for (int c = a - 1; c <= b - 1; c++) {
                res[c] += k;
            }
            i++;
        }
        long minVal = Integer.MAX_VALUE;
        for (int p = 0; p < res.length; p++) {
            if (res[p] < minVal) {
                minVal = res[p];
            }
        }

        return minVal;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 2, 4, 5 },
                { 1, 3, 2 },
                { 3, 5, 3 }

        };

        System.out.println(findMin(5, 3, arr));
    }

}
