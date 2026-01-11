import java.util.*;

public class ActivitySel {

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int activites[][] = new int[start.length][3];
        for (int i = 0; i < end.length; i++) {
            activites[i][0] = i;
            activites[i][1] = start[i];
            activites[i][2] = end[i];
        }

        // sorting of 2-D array
        Arrays.sort(activites, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        int lastEnded = activites[0][2];
        ans.add(activites[0][0]);
        int count = 1;
        for (int i = 1; i < start.length; i++) {
            if (activites[i][1] >= lastEnded) {
                count++;
                ans.add(i);
                lastEnded = activites[i][2];
            }
        }

        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A" + ans.get(i));
        }

    }
}
