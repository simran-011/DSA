
public class titling {
    public static int tiling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int vertical = tiling(n - 1);
        int horizontal = tiling(n - 2);
        int totalWays = vertical + horizontal;
        return totalWays;
    }

    public static void main(String[] args) {

    }
}
