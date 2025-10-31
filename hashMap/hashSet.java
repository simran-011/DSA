import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("karnataka");

        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }

        // for (String city : cities) {
        // System.out.println(city);
        // }

        // int arr[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        // HashSet<Integer> s = new HashSet<>();
        // int cnt = 0;
        // for (int i = 0; i < arr.length; i++) {
        // s.add(arr[i]);

        // }
        // Iterator i = s.iterator();
        // while (i.hasNext()) {
        // cnt++;
        // System.out.println(i.next());
        // }

        // System.out.println("count of elements: " + cnt);

        int arr[] = { 7, 3, 9 };
        int arr1[] = { 6, 3, 9, 2, 9, 4 };
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            s1.add(arr[i]);
        }

        for (int i = 0; i < arr1.length; i++) {
            s2.add(arr1[i]);
        }

        HashSet<Integer> interSet = new HashSet<>(s1);
        // interSet.retainAll(s2);
        // System.out.println(interSet);


        // intersection manually
        int count = 0;
        for(int i=0; i<arr1.length; i++) {
            if(interSet.contains(arr1[i])) {
                count++;
                interSet.remove(arr[i]);
            }
        }
        



    }
}
