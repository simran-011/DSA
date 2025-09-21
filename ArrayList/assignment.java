package ArrayList;

import java.util.*;

public class assignment {

    // question 1
    public static boolean checkOrder(ArrayList<Integer> list) {
        int n = list.size();
        // descending order
        if (list.get(0) > list.get(n - 1)) {
            int i = 1;
            while (i < n - 1) {
                if (list.get(i) < list.get(i + 1)) {
                    return false;
                }
                i++;
            }

        }

        // Ascending Order
        if (list.get(0) < list.get(n - 1)) {

            int i = 1;
            while (i < n - 1) {
                if (list.get(i) > list.get(i + 1)) {
                    return false;
                }
                i++;
            }

        }
        return true;
    }

    // question2

    public static ArrayList<Integer> lonelyEle(ArrayList<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.size();
        Collections.sort(nums);

        if (n == 0) {
            return result;
        }
        if (n == 1) {
            result.add(0);
            return result;
        }
        for (int i = 1; i < n - 1; i++) {
            if (nums.get(i - 1) != nums.get(i) - 1 && nums.get(i + 1) != nums.get(i) + 1
                    && nums.get(i + 1) != nums.get(i) && nums.get(i - 1) != nums.get(i)) {
                result.add(nums.get(i));
            }
        }

        if (nums.get(1) != nums.get(0) + 1 && nums.get(1) != nums.get(0)) {
            result.add(nums.get(0));
        }

        if (nums.get(n - 2) != nums.get(n - 1) - 1 && nums.get(n - 2) != nums.get(n - 1)) {
            result.add(nums.get(n - 1));
        }

        return result;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(3);

        System.out.println(lonelyEle(list1));

    }

}
