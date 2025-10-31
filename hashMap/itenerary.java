import java.util.*;

public class itenerary {
    public static String getStart(HashMap<String, String> map) {
        HashMap<String, String> revMap = new HashMap<>();
        for (String str : map.keySet()) {
            revMap.put(map.get(str), str);
        }

        for (String str : map.keySet()) {
            if (!revMap.containsKey(str)) {
                return str;
            }
        }
        return null;
    }

    public static int maxLength(int arr[]) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int sum = 0;
        int len = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (sum == 0) {
                len = j + 1;
            }
            if (m.containsKey(sum)) {
                len = Math.max(len, j - m.get(sum));

            } else {
                m.put(sum, j);
            }
        }
        return len;

    }

    public static void main(String[] args) {
        // HashMap<String, String> tickets = new HashMap<>();
        // tickets.put("chennai", "bangaluru");
        // tickets.put("mumbai", "delhi");
        // tickets.put("goa", "chennai");
        // tickets.put("delhi", "goa");

        // String start = getStart(tickets);
        // System.out.print(start);
        // for (String s : tickets.keySet()) {
        // System.out.print("-> " + tickets.get(start));
        // start = tickets.get(start);
        // }

        // int arr[] = { -31, -48, -90, 54, 20, 95, 6, -86, 22 };
        // System.out.println(maxLength(arr));

        // getting sum of array equals to k
        int arr[] = { 1, 2, 3 };
        int k = 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int ans = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum - k)) { // sum(i)
                ans += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("ans " + ans);

    }
}
