import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class fractionalSack {

    public static int minDiffPairs(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);
        int minDiff = 0;
        for (int i = 0; i < a.length; i++) {
            minDiff += Math.abs(a[i] - b[i]);
        }
        return minDiff;
    }

    public static int indianCoins(Integer coins[], int amount) {
        Arrays.sort(coins, Collections.reverseOrder());
        int count = 0;
        int a = amount;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= a) {

                while (coins[i] <= a) {
                    count++;
                    a = a - coins[i];

                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        double ratio[][] = new double[weight.length][2];
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = w;
        int value = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                value += val[idx];
                capacity -= weight[idx];
            } else {
                value += (ratio[i][1] * capacity);
                break;
            }
        }

        // System.out.println("final Value " + value + " ");

        int a[] = { 4, 1, 8, 7 };
        int b[] = { 2, 3, 6, 5 };

        // System.out.println(minDiffPairs(a, b));
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        System.out.println(indianCoins(coins, 590));
    }
}
