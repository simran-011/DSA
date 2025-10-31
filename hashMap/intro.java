
import java.util.*;

public class intro {

    public static int majorityEle(int arr[]) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int majEle = 0;
        for (int i = 0; i < arr.length; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }
        int val = arr.length / 3;
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            int value = e.getValue();
            if (value > val) {
                majEle = e.getKey();
            }
        }
        return majEle;
    }

    public static boolean anagram(String str1, String str2) {
        HashMap<Character, Integer> m = new HashMap<>();
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            m.put(str1.charAt(i), m.getOrDefault(str1.charAt(i), 0) + 1);
        }

        for (int j = 0; j < str2.length(); j++) {
            char ch = str2.charAt(j);
            if (m.containsKey(ch)) {

                m.put(ch, m.get(ch) - 1);
                if (m.get(ch) == 0) {
                    m.remove(ch);
                }
            } else {
                return false;
            }
        }
        if (m.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(anagram(str1, str2));

    }
}
