package bactracking;

public class grid {
    public static int gridWays(int n, int m, int i, int j) {
        if (i == n - 1 && j == m - 1) {
            return 1; // at target
        } else if (i == n || j == m) {
            return 0; // boundary condition
        }

        int w1 = gridWays(n, m, i, j + 1); // right
        int w2 = gridWays(n, m, i + 1, j); // down
        return w1 + w2;
    }

    public static void main(String[] args) {
        System.out.println(gridWays(3, 3, 0, 0));
    }
}
