package ArrayList;

import java.util.ArrayList;

public class maxWater {

    // brute force approach O(n^2)
    public static float maxWaterTank(ArrayList<Integer> heights) {
        float maxWater = Integer.MIN_VALUE;
        for (int i = 0; i < heights.size(); i++) {
            for (int j = i + 1; j < heights.size(); j++) {
                float height = Math.min(heights.get(i), heights.get(j));
                float width = j - i;
                float area = height * width;
                maxWater = Math.max(maxWater, area);
            }
        }
        return maxWater;
    }

    // 2-pointer approach O(n)
    public static int storeWater(ArrayList<Integer> heights) {
        int maxWater = Integer.MIN_VALUE;
        int lp = 0;
        int rp = heights.size() - 1;

        while (lp < rp) {
            int height = Math.min(heights.get(rp), heights.get(lp));
            int width = rp - lp;
            int area = height * width;
            maxWater = Math.max(area, maxWater);

            if (heights.get(lp) < heights.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    // brute approach
    public static void printTargetSum(ArrayList<Integer> list, int targetSum) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int sum = list.get(i) + list.get(j);

                if (sum == targetSum) {
                    System.out.println("( " + list.get(i) + "," + list.get(j) + ")");
                }
            }
        }
    }

    // 2-pointer approach
    public static boolean targetSum(ArrayList<Integer> numbers, int target) {
        int lp = 0;
        int rp = numbers.size() - 1;

        while (lp < rp) {
            int sum = numbers.get(lp) + numbers.get(rp);

            if (sum == target) {
                return true;
            } else if (sum < target) {
                lp++;
            } else if (sum > target) {
                rp--;
            }
        }
        return false;

    }

    // 2 pointer approach for pairSum2
    public static boolean pairSum2(ArrayList<Integer> numbers, int target) {
        int bp = -1;
        int n = numbers.size();
        for (int i = 0; i < n; i++) {
            if (numbers.get(i) > numbers.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;

        while (lp != rp) {
            if (numbers.get(lp) + numbers.get(rp) == target) {
                return true;
            } else if (numbers.get(lp) + numbers.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>();
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

        // float result = maxWaterTank(heights);
        // int result = storeWater(heights);
        // System.out.println(result);

        // printTargetSum(heights, 9);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        // System.out.println(targetSum(numbers, 50));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(pairSum2(list, 50));
    }
}
