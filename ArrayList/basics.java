package ArrayList;

import java.util.*;

public class basics {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        // operations on ArrayList
        // add function
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        // System.out.println(list1);

        // get function

        // int ele = list1.get(0);
        // System.out.println(ele);

        // list1.remove(3);
        // System.out.println(list1);

        // list1.set(2, 10);
        // System.out.println(list1);

        // System.out.println(list1.contains(11));

        // list1.add(1, 11);
        // System.out.println(list1);

        // iteration on an arrayList

        // for (int i = list1.size() - 1; i >= 0; i--) {
        // System.out.print(list1.get(i) + " ");
        // }

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(5);
        list2.add(9);
        list2.add(3);
        list2.add(6);

        // max in arrayList
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < list2.size(); i++) {
        // // if (list2.get(i) > max) {
        // // max = list2.get(i);
        // // }
        // max = Math.max(max, list2.get(i));
        // }

        // System.out.println("max value: " + max);

        // swap two numbers
        // System.out.println(list2);

        // int idx1 = 2, idx2 = 3;
        // int a = list2.get(idx1);
        // list2.set(idx1, list2.get(idx2));
        // list2.set(idx2, a);

        // System.out.println(list2);

        // sorting using inbuilt method
        System.out.println(list2);
        // Collections.sort(list2); // by default ascending order
        // System.out.println(list2);

        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);

    }
}
